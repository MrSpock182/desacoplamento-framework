package io.github.mrspock182.desacoplamento.framework.repository.implementation;

import io.github.mrspock182.desacoplamento.framework.core.domian.Client;
import io.github.mrspock182.desacoplamento.framework.repository.ClientRepository;
import io.github.mrspock182.desacoplamento.framework.repository.orm.ClientOrm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class ClientRepositorySpringData implements ClientRepository {

    @Autowired
    private ClientRepositoryWithSpringData repository;

    @Override
    public void save(Client client) {
        ClientOrm clientOrm = new ClientOrm();
        clientOrm.setId(UUID.randomUUID().toString());
        clientOrm.setFirstName(client.getFirstName());
        clientOrm.setLastName(client.getLastName());

        repository.save(clientOrm);
    }
}