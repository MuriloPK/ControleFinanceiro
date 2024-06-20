package com.clubeselvas.ControleFinanceiro.domain.entity;

import com.clubeselvas.ControleFinanceiro.domain.enums.TipoPagamento;
import jakarta.persistence.*;
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
    @NotBlank
    @Enumerated(EnumType.STRING)
    private TipoPagamento tipoPagamento;
    @NotNull
    private Long valorMensalidade;
    @NotNull
    private LocalDate dataPagamento;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

}
