package io.github.mrspock182.desacoplamento.framework.core.service;

public interface PagamentoFactory {
    PagamentoBoleto factory(Integer bank);
}
