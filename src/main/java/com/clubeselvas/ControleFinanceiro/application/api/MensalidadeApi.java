package com.clubeselvas.ControleFinanceiro.application.api;

import com.clubeselvas.ControleFinanceiro.application.api.request.MensalidadeRequest;
import com.clubeselvas.ControleFinanceiro.application.api.response.MensalidadeListResponse;
import com.clubeselvas.ControleFinanceiro.application.api.response.MensalidadeResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/mensalidade")
public interface MensalidadeApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    MensalidadeResponse postMensalidade(@Valid @RequestBody MensalidadeRequest mensalidadeRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<MensalidadeListResponse> getTodasMensalidades();

}