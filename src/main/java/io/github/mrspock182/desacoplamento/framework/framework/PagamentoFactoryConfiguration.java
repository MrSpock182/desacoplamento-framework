package io.github.mrspock182.desacoplamento.framework.framework;

import io.github.mrspock182.desacoplamento.framework.core.service.PagamentoFactory;
import io.github.mrspock182.desacoplamento.framework.core.service.implementation.PagamentoFactoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PagamentoFactoryConfiguration {

    @Bean
    public PagamentoFactory factory() {
        return new PagamentoFactoryImpl();
    }

}
