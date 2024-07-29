package com.clubeselvas.ControleFinanceiro.application.api.controller;

import com.clubeselvas.ControleFinanceiro.application.api.MensalidadeApi;
import com.clubeselvas.ControleFinanceiro.application.api.request.MensalidadeRequest;
import com.clubeselvas.ControleFinanceiro.application.api.response.MensalidadeListResponse;
import com.clubeselvas.ControleFinanceiro.application.api.response.MensalidadeResponse;
import com.clubeselvas.ControleFinanceiro.application.service.MensalidadeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class MensalidadeController implements MensalidadeApi {

    private final MensalidadeService mensalidadeService;

    @Override
    public MensalidadeResponse postMensalidade(MensalidadeRequest mensalidadeRequest) {
        log.info("[inicia]MensalidadeController - postMensalidade");
        MensalidadeResponse mensalidadeCriada = mensalidadeService.criaMensalidade(mensalidadeRequest);
        log.info("[finaliza]MensalidadeController - postMensalidade");
        return mensalidadeCriada;
    }

    @Override
    public List<MensalidadeListResponse> getTodasMensalidades() {
        log.info("[inicia]MensalidadeController - getTodasMensalidades");
        List<MensalidadeListResponse> mostraTodasMensalidades = mensalidadeService.buscaTodasMensalidades();
        log.info("[finaliza]MensalidadeController - getTodasMensalidades");
        return mostraTodasMensalidades;
    }
}