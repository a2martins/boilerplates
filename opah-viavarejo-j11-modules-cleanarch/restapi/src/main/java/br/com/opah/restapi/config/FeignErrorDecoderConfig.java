package br.com.opah.restapi.config;

import br.com.opah.restapi.exception.NotFoundResourceException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Optional.ofNullable;

@RequiredArgsConstructor
public class FeignErrorDecoderConfig implements ErrorDecoder {
    private final ErrorDecoder defaultErrorDecoder = new Default();
    private final ObjectMapper objectMapper;

    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() >= 400 && response.status() <= 499) {
            if (response.status() == 404) {
                return ofNullable(getBodyAsString(response))
                        .map(stringObjectMap -> new NotFoundResourceException(response.request().toString(), stringObjectMap))
                        .orElse(new NotFoundResourceException(response.request().toString()));
            }
        }
        return defaultErrorDecoder.decode(methodKey, response);
    }

    private Map<String, Object> getBodyAsString(Response response) {
        try {
            return objectMapper.readValue(IOUtils.toString(response.body().asInputStream(),
                    String.valueOf(StandardCharsets.UTF_8)), new TypeReference<HashMap<String, Object>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyMap();
    }
}
