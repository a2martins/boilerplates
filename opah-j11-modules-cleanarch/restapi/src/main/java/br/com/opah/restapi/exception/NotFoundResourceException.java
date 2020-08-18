package br.com.opah.restapi.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotFoundResourceException extends RuntimeException {

    @Getter
    private Map<String, Object> errorObject;

    public NotFoundResourceException(String message) {
        super(message);
    }

    public NotFoundResourceException(String message, Map<String, Object> errorObject) {
        super(message);
        this.errorObject = errorObject;
    }
}
