package com.cancelier.agendamentos.domain.estabelecimento;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EstabelecimentoModalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "estabelecimento_id", nullable = false)
    @ManyToOne
    private Estabelecimento estabelecimento;

    @JoinColumn(name = "modalidade_id", nullable = false)
    @ManyToOne
    private Modalidade modalidade;

}
