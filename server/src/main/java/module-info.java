module server {
    requires com.payment-simulation.core; // Dependência do módulo CORE
    requires spring.core;
    requires spring.beans;
    requires spring.context;

    exports com.payment-simulation.server.protocol;
    exports com.payment-simulation.server.socket;
}