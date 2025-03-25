package com.cancelier.agendamentos.service;

import com.cancelier.agendamentos.domain.Usuario;
import com.cancelier.agendamentos.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long, UsuarioRepository> implements UsuarioService {

    public UsuarioServiceImpl(UsuarioRepository repo) {
        super(repo);
    }

}
