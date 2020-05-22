package io.github.mrspock182.desacoplamento.framework.repository;

import io.github.mrspock182.desacoplamento.framework.core.domian.Client;

public interface ClientRepository {
    void save(Client client);
}
