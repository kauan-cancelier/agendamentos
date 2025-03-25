package com.cancelier.agendamentos.service.impl;

import com.cancelier.agendamentos.domain.estabelecimento.Estabelecimento;
import com.cancelier.agendamentos.repository.EstabelecimentoRepository;
import com.cancelier.agendamentos.service.EstabelecimentoService;
import com.cancelier.agendamentos.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EstabelecimentoServiceImpl extends BaseServiceImpl<Estabelecimento, Long, EstabelecimentoRepository> implements EstabelecimentoService {

    public EstabelecimentoServiceImpl(EstabelecimentoRepository repo) {
        super(repo);
    }

}
