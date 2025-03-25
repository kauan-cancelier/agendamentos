package com.cancelier.agendamentos.repository;

import com.cancelier.agendamentos.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
