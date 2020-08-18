module restapi {
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.webmvc;
    requires spring.web;
    requires spring.beans;
    requires spring.cloud.openfeign.core;
    requires feign.core;
    requires static lombok;
    requires com.fasterxml.classmate;
    requires com.fasterxml.jackson.databind;
    requires commons.io;
    requires org.slf4j;
//    requires springfox.swagger2;
//    requires springfox.spring.web;
//    requires springfox.spi;
//    requires springfox.core;

    requires controller;

    exports br.com.opah.restapi to spring.beans, spring.context;
    exports br.com.opah.restapi.controller to spring.beans, spring.web;
    exports br.com.opah.restapi.config to spring.beans, spring.context;

    opens br.com.opah.restapi to spring.core;
    opens br.com.opah.restapi.config to spring.core;
}