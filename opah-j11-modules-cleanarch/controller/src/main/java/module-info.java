module controller {
    requires spring.web;
    requires spring.context;
    requires spring.beans;
    requires static lombok;
    requires org.mapstruct;
    requires java.sql;
    requires java.compiler;
    requires com.fasterxml.jackson.databind;

    requires domain;
    requires usecase;

    uses br.com.opah.usecase.FindGithubUser;

    exports br.com.opah.controllers to restapi, spring.beans;
    exports br.com.opah.controllers.converter to spring.beans, org.mapstruct;
}