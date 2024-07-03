package com.clubeselvas.ControleFinanceiro.infra;

import com.clubeselvas.ControleFinanceiro.application.repository.MensalidadeRepository;
import com.clubeselvas.ControleFinanceiro.domain.entity.Mensalidade;
import com.clubeselvas.ControleFinanceiro.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class MensalidadeInfraRepository implements MensalidadeRepository {

    private MensalidadeSpringDataJpaRepository mensalidadeSpringDataJpaRepository;

    @Override
    public Mensalidade salva(Mensalidade mensalidade) {
        log.info("[inicia]MensalidadeInfraRepository - salva");
        try {
            mensalidadeSpringDataJpaRepository.save(mensalidade);
        } catch (DataIntegrityViolationException e) {
            throw APIException.build(HttpStatus.BAD_REQUEST, "Existe campos invalidos!", e);
        }
        log.info("[finaliza]MensalidadeInfraRepository - salva");
        return mensalidade;
    }
}
