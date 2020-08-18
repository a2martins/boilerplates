package br.com.opah.integrations;

import br.com.opah.integrations.dto.GithubResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${github.api}", name = "github-user")
public interface FindUserGithub {

    @GetMapping("/users/{login}")
    GithubResponseDTO getUser(@PathVariable("login") String login);
}
