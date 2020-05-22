//package io.github.mrspock182.desacoplamento.framework.repository.implementation;
//
//import com.mongodb.reactivestreams.client.MongoClient;
//import com.mongodb.reactivestreams.client.MongoCollection;
//import com.mongodb.reactivestreams.client.MongoDatabase;
//import io.github.mrspock182.desacoplamento.framework.core.domian.Client;
//import io.github.mrspock182.desacoplamento.framework.repository.ClientRepository;
//import org.bson.Document;
//
//import javax.inject.Inject;
//import javax.inject.Singleton;
//import java.util.UUID;
//
//@Singleton
//public class ClientRepositoryWithMicronout implements ClientRepository {
//
//    @Inject
//    private MongoClient mongoClient;
//
//    @Override
//    public void save(Client client) {
//        MongoDatabase database = mongoClient.getDatabase("clean-code");
//        MongoCollection<Document> collection = database.getCollection("client");
//
//        Document document = new Document("_id", UUID.randomUUID().toString())
//                .append("firstName", client.getFirstName())
//                .append("lastName", client.getLastName());
//        collection.insertOne(document);
//    }
//}
