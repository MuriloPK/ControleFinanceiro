package com.clubeselvas.ControleFinanceiro.application.service;

import com.clubeselvas.ControleFinanceiro.application.api.request.MensalidadeRequest;
import com.clubeselvas.ControleFinanceiro.application.api.response.MensalidadeResponse;

public interface MensalidadeService {

    MensalidadeResponse criaMensalidade(MensalidadeRequest mensalidadeRequest);
}
