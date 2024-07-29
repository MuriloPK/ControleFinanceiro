package com.clubeselvas.ControleFinanceiro.application.api.response;

import com.clubeselvas.ControleFinanceiro.domain.entity.Mensalidade;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class MensalidadeListResponse {

    private UUID idMensalidade;

    private String nomePagador;

    private LocalDate dataPagamento;

    public static List<MensalidadeListResponse> converte(List<Mensalidade> mensalidades) {
        return mensalidades.stream()
                .map(MensalidadeListResponse::new)
                .collect(Collectors.toList());
    }

    public MensalidadeListResponse(Mensalidade mensalidade) {
        super();
        this.idMensalidade = mensalidade.getIdMensalidade();
        this.nomePagador = mensalidade.getNomePagador();
        this.dataPagamento = mensalidade.getDataPagamento();
    }
}