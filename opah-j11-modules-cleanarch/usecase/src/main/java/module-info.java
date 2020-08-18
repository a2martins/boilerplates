import br.com.opah.gateway.RequestGithubGateway;
import br.com.opah.usecase.FindGithubUser;
import br.com.opah.usecase.impl.FindGithubUserImpl;

module usecase {
    requires spring.context;
    requires spring.beans;
    requires static lombok;

    requires domain;
    requires gateway;

    uses RequestGithubGateway;

    provides FindGithubUser with FindGithubUserImpl;

    exports br.com.opah.usecase to controller, restapi;
    exports br.com.opah.usecase.impl to spring.beans;

    opens br.com.opah.usecase.impl to spring.core;
}