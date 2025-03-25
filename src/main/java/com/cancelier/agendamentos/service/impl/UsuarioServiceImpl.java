package com.cancelier.agendamentos.service.impl;

import com.cancelier.agendamentos.domain.usuario.Usuario;
import com.cancelier.agendamentos.repository.UsuarioRepository;
import com.cancelier.agendamentos.service.UsuarioService;
import com.cancelier.agendamentos.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long, UsuarioRepository> implements UsuarioService {

    public UsuarioServiceImpl(UsuarioRepository repo) {
        super(repo);
    }

}
