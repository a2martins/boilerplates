module domain {
    requires static lombok;

    exports br.com.opah.domain to controller, usecase, gateway, integrations, com.fasterxml.jackson.databind;
}