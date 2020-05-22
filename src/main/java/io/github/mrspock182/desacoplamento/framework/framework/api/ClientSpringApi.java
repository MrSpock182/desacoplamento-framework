package io.github.mrspock182.desacoplamento.framework.framework.api;

import io.github.mrspock182.desacoplamento.framework.core.domian.Client;
import io.github.mrspock182.desacoplamento.framework.core.io.ClientIO;
import io.github.mrspock182.desacoplamento.framework.core.service.ClientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientSpringApi implements ClientIO {

    private final ClientService service;

    public ClientSpringApi(ClientService service) {
        this.service = service;
    }

    @Override
    @PostMapping("/save")
    public void save(@RequestBody Client client) {
        this.service.save(client);
    }

}