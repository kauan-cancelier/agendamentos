package com.cancelier.agendamentos.repository;

import com.cancelier.agendamentos.domain.estabelecimento.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
}
