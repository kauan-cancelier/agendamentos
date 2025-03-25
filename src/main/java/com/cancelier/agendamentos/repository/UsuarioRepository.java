package com.cancelier.agendamentos.repository;

import com.cancelier.agendamentos.domain.Usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
