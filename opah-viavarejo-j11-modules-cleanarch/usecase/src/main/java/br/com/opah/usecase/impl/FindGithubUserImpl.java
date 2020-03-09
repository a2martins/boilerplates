package br.com.opah.usecase.impl;

import br.com.opah.domain.Github;
import br.com.opah.gateway.RequestGithubGateway;
import br.com.opah.usecase.FindGithubUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindGithubUserImpl implements FindGithubUser {

    @Autowired
    private RequestGithubGateway requestGithubGateway;

    @Override
    public Github execute(Github github) {
        return requestGithubGateway.shoot(github);
    }
}
