package com.cancelier.agendamentos.controller;

import com.cancelier.agendamentos.controller.base.BaseController;
import com.cancelier.agendamentos.domain.Usuario.Usuario;
import com.cancelier.agendamentos.service.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuarioController extends BaseController<Usuario, Long> {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        super(usuarioService);
        this.usuarioService = usuarioService;
    }

}
