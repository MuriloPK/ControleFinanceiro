package com.clubeselvas.ControleFinanceiro.application.repository;

import com.clubeselvas.ControleFinanceiro.domain.entity.Mensalidade;

import java.util.List;

public interface MensalidadeRepository {

    Mensalidade salva(Mensalidade mensalidade);

    List<Mensalidade> buscaTodasMensalidades();
}
