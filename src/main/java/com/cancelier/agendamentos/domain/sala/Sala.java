package com.cancelier.agendamentos.domain.sala;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoSala tipoSala;

    @Column(nullable = false)
    private Integer quantidadeMinima;

    @Column(nullable = false)
    private Integer quantidadeMaxima;

    @Column(nullable = false)
    private LocalDateTime dataMaximaDeAceitacao;

    @Column
    @Enumerated(EnumType.STRING)
    private TipoCobranca tipoCobranca;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusDaSala status;

}
