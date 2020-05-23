package io.github.mrspock182.desacoplamento.framework.core.service.implementation;

import io.github.mrspock182.Encryption;
import io.github.mrspock182.desacoplamento.framework.core.domian.Client;
import io.github.mrspock182.desacoplamento.framework.core.service.ClientEncryptionService;

public class ClientEncryptionWithCrypto4JServiceImpl implements ClientEncryptionService {

    private final Encryption encryption;

    public ClientEncryptionWithCrypto4JServiceImpl(Encryption encryption) {
        this.encryption = encryption;
    }

    @Override
    public Client encryption(Client client) {
        Client clientEncrypt = new Client();
        clientEncrypt.setFirstName(this.encryption.encrypt(client.getFirstName()));
        clientEncrypt.setLastName(this.encryption.encrypt(client.getLastName()));
        return clientEncrypt;
    }
}
