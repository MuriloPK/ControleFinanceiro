package com.clubeselvas.ControleFinanceiro.application.api.response;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class MensalidadeResponse {

    private UUID idMensalidade;
}
