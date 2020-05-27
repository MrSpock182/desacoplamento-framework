package io.github.mrspock182.desacoplamento.framework.framework;

import io.github.mrspock182.Encryption;
import io.github.mrspock182.constant.Cipher;
import io.github.mrspock182.constant.TypeEncryption;
import io.github.mrspock182.constant.Unicode;
import io.github.mrspock182.encryption.EncryptionSymmetrical;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EncryptionCryptoForJConfiguration {

    @Value("${crypto.password}")
    private String key;

    @Bean
    public Encryption encryption() {
        return new EncryptionSymmetrical(TypeEncryption.AES, Unicode.UTF8,
                key, Cipher.PKCS5PADDING);
    }

}
