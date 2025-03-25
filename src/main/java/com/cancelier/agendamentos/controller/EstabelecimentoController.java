package com.cancelier.agendamentos.controller;

import com.cancelier.agendamentos.controller.base.BaseController;
import com.cancelier.agendamentos.domain.estabelecimento.Estabelecimento;
import com.cancelier.agendamentos.service.EstabelecimentoService;
import com.cancelier.agendamentos.service.base.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("estabelecimentos")
public class EstabelecimentoController extends BaseController<Estabelecimento, Long> {

    private final EstabelecimentoService estabelecimentoService;

    public EstabelecimentoController(EstabelecimentoService estabelecimentoService) {
        super(estabelecimentoService);
        this.estabelecimentoService = estabelecimentoService;
    }
}
