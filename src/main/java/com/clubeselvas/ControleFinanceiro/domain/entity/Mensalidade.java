package com.clubeselvas.ControleFinanceiro.domain.entity;

import com.clubeselvas.ControleFinanceiro.application.api.request.MensalidadeRequest;
import com.clubeselvas.ControleFinanceiro.domain.enums.TipoPagamento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Mensalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idMensalidade;

    @NotBlank
    private String nomePagador;

    @NotBlank
    private String decricaoPagamento;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoPagamento tipoPagamento;

    @NotNull
    private Double valorMensalidade;

    @NotNull
    private LocalDate dataPagamento;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Mensalidade(MensalidadeRequest mensalidadeRequest) {
        this.nomePagador = mensalidadeRequest.getNomePagador();
        this.decricaoPagamento = mensalidadeRequest.getDecricaoPagamento();
        this.tipoPagamento = mensalidadeRequest.getTipoPagamento();
        this.valorMensalidade = mensalidadeRequest.getValorMensalidade();
        this.dataPagamento = mensalidadeRequest.getDataPagamento();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}