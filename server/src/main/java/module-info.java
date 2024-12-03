module com.payment-simulation.server {

        // Requer o Spring Boot para a execução de funcionalidades do servidor
        requires spring.boot;
        requires spring.boot.autoconfigure;

        // Requer o módulo 'core' para utilizar suas interfaces e serviços
        requires com.payment-simulation.core;

        // Se estiver usando bibliotecas externas como jPOS para o protocolo ISO8583, também é necessário incluir essas dependências
        requires jpos;  // Supondo que a biblioteca jPOS esteja no classpath (não é uma dependência de módulo)

        // Expondo pacotes necessários para integração com a camada de API ou comunicação externa
        exports com.payment-simulation.server.socket;
        exports com.payment-simulation.server.protocol;

}