package io.github.mrspock182.desacoplamento.framework.core.service.implementation;

import io.github.mrspock182.desacoplamento.framework.core.service.PagamentoBoleto;

public class PagamentoBoletoSantander implements PagamentoBoleto {

    @Override
    public String pagarBoleto() {
        return "Pagando boleto santander";
    }
}
