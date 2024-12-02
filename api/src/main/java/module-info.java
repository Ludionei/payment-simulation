module api {
    requires com.payment-simulation.core;  // Dependência do módulo CORE
    requires com.payment-simulation.server;  // Dependência do módulo SERVER
    requires spring.boot;
    requires spring.web;
    requires springfox.swagger2;
    requires springfox.swagger.ui;

    exports com.payment-simulation.api.controller;
    exports com.payment-simulation.api.infrastructure;
}