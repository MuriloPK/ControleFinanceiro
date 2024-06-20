package com.clubeselvas.ControleFinanceiro.application.service.impl;

import com.clubeselvas.ControleFinanceiro.application.api.request.MensalidadeRequest;
import com.clubeselvas.ControleFinanceiro.application.api.response.MensalidadeResponse;
import com.clubeselvas.ControleFinanceiro.application.service.MensalidadeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class MensalidadeServiceImpl implements MensalidadeService {

    @Override
    public MensalidadeResponse criaMensalidade(MensalidadeRequest mensalidadeRequest) {
        return null;
    }
}
