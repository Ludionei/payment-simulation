module com.payment-simulation.api {

        // Requer o Spring Boot Starter Web para a criação de endpoints REST
        requires spring.boot;
        requires spring.boot.autoconfigure;
        requires spring.web;
        requires spring.context;

        // Requer o módulo 'core' para utilizar suas interfaces e serviços no controller
        requires com.payment-simulation.core;

        // Expondo pacotes necessários para que o servidor ou outros módulos possam acessar os controladores e a infraestrutura da API
        exports com.payment-simulation.api.controller;
        exports com.payment-simulation.api.infrastructure;

}