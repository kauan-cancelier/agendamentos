package com.cancelier.agendamentos.controller.base;

import com.cancelier.agendamentos.service.base.BaseService;
import org.springframework.web.bind.annotation.*;

public class BaseController<T, ID> {

    private final BaseService<T, ID> baseService;

    public BaseController(BaseService<T, ID> baseService) {
        this.baseService = baseService;
    }

    @PostMapping
    public T salvar(@RequestBody T t) {
        return baseService.salvar(t);
    }

    @GetMapping("/{id}")
    public T buscarPorId(@PathVariable(name = "id") ID id) {
        return baseService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public T deletarPorId(@PathVariable(name = "id") ID id) {
        return baseService.excluir(id);
    }

}
