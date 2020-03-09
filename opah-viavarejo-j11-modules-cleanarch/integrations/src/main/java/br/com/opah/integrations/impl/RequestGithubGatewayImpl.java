package br.com.opah.integrations.impl;

import br.com.opah.domain.Github;
import br.com.opah.gateway.RequestGithubGateway;
import br.com.opah.integrations.FindUserGithub;
import br.com.opah.integrations.converter.GithubResponseDTOTOGithubDomainConverter;
import br.com.opah.integrations.dto.GithubResponseDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestGithubGatewayImpl implements RequestGithubGateway {

    @Autowired
    private FindUserGithub findUserGithub;

    @Autowired
    private GithubResponseDTOTOGithubDomainConverter githubDomainConverter;

    @Override
    public Github shoot(Github github) {
        final var responseDTO = findUserGithub.getUser(github.getLogin());
        return githubDomainConverter.toMapper(responseDTO);
    }
}
