package io.github.mrspock182.desacoplamento.framework.core.service.implementation;

import io.github.mrspock182.desacoplamento.framework.core.domian.Client;
import io.github.mrspock182.desacoplamento.framework.core.service.ClientService;
import io.github.mrspock182.desacoplamento.framework.repository.ClientRepository;

public class ClientServiceImpl implements ClientService {

    private final ClientRepository repository;

    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Client client) {
        this.repository.save(client);
    }
}
