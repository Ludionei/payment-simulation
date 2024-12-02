module api {
    requires com.destaxa.core;  // Dependência do módulo CORE
    requires com.destaxa.server;  // Dependência do módulo SERVER
    requires spring.boot;
    requires spring.web;
    requires springfox.swagger2;
    requires springfox.swagger.ui;

    exports com.destaxa.api.controller;
    exports com.destaxa.api.infrastructure;
}