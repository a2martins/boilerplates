package br.com.opah.controllers;

import br.com.opah.controllers.converter.StringToGithubDomainConverter;
import br.com.opah.usecase.FindGithubUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GithubController {
    private final StringToGithubDomainConverter githubDomainConverter;
    private final FindGithubUser findGithubUser;
    private final ObjectMapper objectMapper;

    public ResponseEntity<String> findGithubUser(String githubUsername) {
        ResponseEntity<String> response;
        try {
            final var github = findGithubUser.execute(
                    githubDomainConverter.toMapper(githubUsername)
            );

            response = ResponseEntity.ok(objectMapper.writeValueAsString(github));
        } catch (JsonProcessingException | RuntimeException e) {
            e.printStackTrace();
            response = ResponseEntity.status(500).body(e.getMessage());
        }
        return response;
    }
}
