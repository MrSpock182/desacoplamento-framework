package io.github.mrspock182.desacoplamento.framework.framework.configuration;

import io.github.mrspock182.desacoplamento.framework.core.service.ClientService;
import io.github.mrspock182.desacoplamento.framework.core.service.implementation.ClientServiceImpl;
import io.github.mrspock182.desacoplamento.framework.repository.ClientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientServiceSpringConfiguration {

    @Bean
    public ClientService clientService(ClientRepository repository) {
        return new ClientServiceImpl(repository);
    }

}