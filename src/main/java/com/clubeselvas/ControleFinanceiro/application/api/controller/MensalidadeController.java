package com.clubeselvas.ControleFinanceiro.application.api.controller;

import com.clubeselvas.ControleFinanceiro.application.api.MensalidadeApi;
import com.clubeselvas.ControleFinanceiro.application.api.request.MensalidadeRequest;
import com.clubeselvas.ControleFinanceiro.application.api.response.MensalidadeResponse;
import com.clubeselvas.ControleFinanceiro.application.service.MensalidadeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class MensalidadeController implements MensalidadeApi {

    private MensalidadeService mensalidadeService;

    @Override
    public MensalidadeResponse postMensalidade(MensalidadeRequest mensalidadeRequest) {
        log.info("[inicia]MensalidadeController - postMensalidade");
        MensalidadeResponse mensalidadeCriada = mensalidadeService.criaMensalidade(mensalidadeRequest);
        log.info("[finaliza]MensalidadeController - postMensalidade");
        return mensalidadeCriada;
    }
}
