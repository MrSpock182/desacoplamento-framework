//package io.github.mrspock182.desacoplamento.framework.framework.api;
//
//import io.github.mrspock182.desacoplamento.framework.core.domian.Client;
//import io.github.mrspock182.desacoplamento.framework.core.io.ClientIO;
//import io.github.mrspock182.desacoplamento.framework.core.service.ClientService;
//import io.micronaut.http.annotation.Controller;
//import io.micronaut.http.annotation.Post;
//
//import javax.inject.Inject;
//
//@Controller
//public class ClientMicronoutApi implements ClientIO {
//
//    @Inject
//    private ClientService service;
//
//    @Post("/save")
//    @Override
//    public void save(Client client) {
//        service.save(client);
//    }
//}