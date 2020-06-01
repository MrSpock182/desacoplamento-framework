package io.github.mrspock182.desacoplamento.framework.core.service.implementation;

import io.github.mrspock182.desacoplamento.framework.core.service.PagamentoBoleto;
import io.github.mrspock182.desacoplamento.framework.core.service.PagamentoFactory;

public class PagamentoFactoryImpl implements PagamentoFactory {

    private final PagamentoBoletoItau itau;
    private final PagamentoBoletoSantander santander;

    public PagamentoFactoryImpl() {
        this.itau = new PagamentoBoletoItau();
        this.santander = new PagamentoBoletoSantander();
    }

    @Override
    public PagamentoBoleto factory(Integer bank) {
        switch (bank) {
            case 1:
                return itau;
            default:
                return santander;
        }
    }

}
