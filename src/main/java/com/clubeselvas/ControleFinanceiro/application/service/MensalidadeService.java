package com.clubeselvas.ControleFinanceiro.application.service;

import com.clubeselvas.ControleFinanceiro.application.api.request.MensalidadeRequest;
import com.clubeselvas.ControleFinanceiro.application.api.response.MensalidadeListResponse;
import com.clubeselvas.ControleFinanceiro.application.api.response.MensalidadeResponse;

import java.util.List;

public interface MensalidadeService {

    MensalidadeResponse criaMensalidade(MensalidadeRequest mensalidadeRequest);

    List<MensalidadeListResponse> buscaTodasMensalidades();
}