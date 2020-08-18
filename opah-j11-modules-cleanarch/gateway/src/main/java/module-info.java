module gateway {
    requires spring.beans;
    requires spring.context;

    requires domain;

    exports br.com.opah.gateway to usecase, integrations;
}