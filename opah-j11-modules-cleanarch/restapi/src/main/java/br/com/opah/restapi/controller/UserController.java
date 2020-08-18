package br.com.opah.restapi.controller;

import br.com.opah.controllers.GithubController;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class UserController {
    private final GithubController githubController;

    @GetMapping("/github-user/{githubUsername}")
    public ResponseEntity<String> githubUser(@PathVariable("githubUsername") String githubUsername) {
        return githubController.findGithubUser(githubUsername);
    }

}
