package io.github.mrspock182.desacoplamento.framework.core.service.implementation.builder;

import io.github.mrspock182.Encryption;
import io.github.mrspock182.desacoplamento.framework.core.service.implementation.ClientEncryptionWithCrypto4JServiceImpl;

public final class ClientEncryptionWithCrypto4JServiceImplBuilder {
    private Encryption encryption;

    private ClientEncryptionWithCrypto4JServiceImplBuilder(Encryption encryption) {
        this.encryption = encryption;
    }

    public static ClientEncryptionWithCrypto4JServiceImplBuilder builder(Encryption encryption) {
        return new ClientEncryptionWithCrypto4JServiceImplBuilder(encryption);
    }

    public ClientEncryptionWithCrypto4JServiceImpl build() {
        return new ClientEncryptionWithCrypto4JServiceImpl(encryption);
    }
}
