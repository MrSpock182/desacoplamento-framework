package io.github.mrspock182.desacoplamento.framework.repository.implementation;

import io.github.mrspock182.desacoplamento.framework.repository.orm.ClientOrm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositoryWithSpringData extends MongoRepository<ClientOrm, String> {
}