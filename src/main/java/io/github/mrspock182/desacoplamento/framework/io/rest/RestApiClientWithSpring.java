package io.github.mrspock182.desacoplamento.framework.io.rest;

import io.github.mrspock182.desacoplamento.framework.core.domian.Client;
import io.github.mrspock182.desacoplamento.framework.core.service.PagamentoFactory;
import io.github.mrspock182.desacoplamento.framework.io.ClientIO;
import io.github.mrspock182.desacoplamento.framework.core.service.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestApiClientWithSpring implements ClientIO {

    private final ClientService service;
    private final PagamentoFactory factory;

    public RestApiClientWithSpring(ClientService service, PagamentoFactory factory) {
        this.service = service;
        this.factory = factory;
    }

    @Override
    @PostMapping("/save")
    public void save(@RequestBody Client client) {
        this.service.save(client);
    }

    @Override
    @GetMapping("/pagamento/{banco}")
    public String realizarPagamento(@PathVariable("banco") Integer banco) {
        return factory.factory(banco)
                .pagarBoleto();
    }
}