module core {
    exports com.payment-simulation.core.domain;
    exports com.payment-simulation.core.service;
    exports com.payment-simulation.core.port;

    requires spring.core;
    requires spring.beans;
}