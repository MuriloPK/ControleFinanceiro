package com.clubeselvas.ControleFinanceiro.application.api.request;

import com.clubeselvas.ControleFinanceiro.domain.enums.TipoPagamento;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Value
public class MensalidadeRequest {

    @NotBlank
    private String nomePagador;

    @NotBlank
    private String decricaoPagamento;

    @NotNull
    private TipoPagamento tipoPagamento;

    @NotNull
    private Double valorMensalidade;

    @NotNull
    private LocalDate dataPagamento;

}