module com.payment-simulation.core {

        // Requer o Lombok para reduzir o boilerplate no código
        requires lombok;

        // Requer o Spring Boot para a execução de funcionalidades do Core (embora o core em si não tenha dependências diretas de Spring Boot)
        requires spring.boot;

        // Expondo pacotes para que outros módulos possam acessar a lógica de domínio, serviços e portas
        exports com.payment-simulation.core.service;
        exports com.payment-simulation.core.port;
        exports com.payment-simulation.core.domain;

        // Importando pacotes do módulo 'api' para o uso de controladores ou integração com a camada de API
        requires transitive com.payment-simulation.api;

}