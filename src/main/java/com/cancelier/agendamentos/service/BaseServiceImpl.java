package com.cancelier.agendamentos.service;

import org.springframework.data.jpa.repository.JpaRepository;

public class BaseServiceImpl<T, ID, R extends JpaRepository<T, ID>> implements BaseService<T, ID> {

    private final R repo;

    public BaseServiceImpl(R repo) {
        this.repo = repo;
    }
    @Override
    public T salvar(T t) {
        return repo.save(t);
    }
}