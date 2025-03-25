package com.cancelier.agendamentos.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario_papel")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioPapel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "usuario_id")
    @ManyToOne
    private Usuario usuario;

    @Column
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

}
