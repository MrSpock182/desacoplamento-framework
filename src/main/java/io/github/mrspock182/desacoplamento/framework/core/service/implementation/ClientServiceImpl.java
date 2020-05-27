package io.github.mrspock182.desacoplamento.framework.core.service.implementation;

import io.github.mrspock182.Encryption;
import io.github.mrspock182.desacoplamento.framework.core.domian.Client;
import io.github.mrspock182.desacoplamento.framework.core.service.ClientEncryptionService;
import io.github.mrspock182.desacoplamento.framework.core.service.ClientService;
import io.github.mrspock182.desacoplamento.framework.core.service.implementation.builder.ClientEncryptionWithCrypto4JServiceImplBuilder;
import io.github.mrspock182.desacoplamento.framework.repository.ClientRepository;

public class ClientServiceImpl implements ClientService {

    private final ClientRepository repository;
    private final ClientEncryptionService encryptionService;

    public ClientServiceImpl(ClientRepository repository, Encryption encryption) {
        this.repository = repository;
        this.encryptionService = ClientEncryptionWithCrypto4JServiceImplBuilder.builder(encryption)
                .build();
    }

    @Override
    public void save(Client client) {
        this.repository.save(encryptionService.encryption(client));
    }
}
