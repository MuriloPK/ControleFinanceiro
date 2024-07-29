package com.clubeselvas.ControleFinanceiro.application.service.impl;

import com.clubeselvas.ControleFinanceiro.application.api.request.MensalidadeRequest;
import com.clubeselvas.ControleFinanceiro.application.api.response.MensalidadeListResponse;
import com.clubeselvas.ControleFinanceiro.application.api.response.MensalidadeResponse;
import com.clubeselvas.ControleFinanceiro.application.repository.MensalidadeRepository;
import com.clubeselvas.ControleFinanceiro.application.service.MensalidadeService;
import com.clubeselvas.ControleFinanceiro.domain.entity.Mensalidade;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class MensalidadeServiceImpl implements MensalidadeService {

    private final MensalidadeRepository mensalidadeRepository;

    @Override
    public MensalidadeResponse criaMensalidade(MensalidadeRequest mensalidadeRequest) {
        log.info("[inicia] MensalidadeServiceImpl - criaMensalidade");
        Mensalidade mensalidade = mensalidadeRepository.salva(new Mensalidade(mensalidadeRequest));
        log.info("[finaliza] MensalidadeServiceImpl - criaMensalidade");
        return MensalidadeResponse.builder().idMensalidade(mensalidade.getIdMensalidade()).build();
    }

    @Override
    public List<MensalidadeListResponse> buscaTodasMensalidades() {
        log.info("[inicia] MensalidadeServiceImpl - buscaTodasMensalidades");
        List<Mensalidade> mensalidades = mensalidadeRepository.buscaTodasMensalidades();
        log.info("[finaliza] MensalidadeServiceImpl - buscaTodasMensalidades");
        return MensalidadeListResponse.converte(mensalidades);
    }
}