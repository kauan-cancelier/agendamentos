package com.cancelier.agendamentos.controller;

import com.cancelier.agendamentos.service.BaseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BaseController<T, ID> {

    private final BaseService<T, ID> baseService;

    public BaseController(BaseService<T, ID> baseService) {
        this.baseService = baseService;
    }

    @PostMapping
    public T salvar(@RequestBody T t) {
        return  baseService.salvar(t);
    }

}
