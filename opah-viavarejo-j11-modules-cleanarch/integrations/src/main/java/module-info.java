import br.com.opah.gateway.RequestGithubGateway;
import br.com.opah.integrations.impl.RequestGithubGatewayImpl;

module integrations {
    requires spring.web;
    requires spring.beans;
    requires spring.context;
    requires spring.cloud.openfeign.core;
    requires feign.core;
    requires static lombok;
    requires org.mapstruct;
    requires java.sql;
    requires java.compiler;
    requires org.apache.tomcat.embed.core;
    requires com.fasterxml.jackson.databind;

    requires gateway;
    requires domain;

    uses br.com.opah.integrations.FindUserGithub;

    provides RequestGithubGateway with RequestGithubGatewayImpl;

    exports br.com.opah.integrations;
    exports br.com.opah.integrations.dto;
    exports br.com.opah.integrations.impl to spring.beans;
    exports br.com.opah.integrations.converter to spring.beans;

    opens br.com.opah.integrations.impl to spring.core;
    opens br.com.opah.integrations.dto to feign.core;
}