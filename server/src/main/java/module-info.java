module server {
    requires com.destaxa.core; // Dependência do módulo CORE
    requires spring.core;
    requires spring.beans;
    requires spring.context;

    exports com.destaxa.server.protocol;
    exports com.destaxa.server.socket;
}