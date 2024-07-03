package com.clubeselvas.ControleFinanceiro.infra;

import com.clubeselvas.ControleFinanceiro.domain.entity.Mensalidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MensalidadeSpringDataJpaRepository extends JpaRepository<Mensalidade, UUID> {
}
