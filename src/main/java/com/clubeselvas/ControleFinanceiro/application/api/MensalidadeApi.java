package com.clubeselvas.ControleFinanceiro.application.api;

import com.clubeselvas.ControleFinanceiro.application.api.request.MensalidadeRequest;
import com.clubeselvas.ControleFinanceiro.application.api.response.MensalidadeResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/mensalidade")
public interface MensalidadeApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    MensalidadeResponse postMensalidade(@Valid @RequestBody MensalidadeRequest mensalidadeRequest);
}
