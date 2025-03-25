package com.cancelier.agendamentos.service.base;

import com.cancelier.agendamentos.exceptions.RegistroNaoEncontradoException;
import com.google.common.base.Preconditions;
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

    @Override
    public T buscarPorId(ID id) {
        Preconditions.checkNotNull(id, "O Id é obrigatório para buscar");
        return repo.findById(id).orElseThrow(RegistroNaoEncontradoException::new);
    }

    @Override
    public T excluir(ID id) {
        T t = buscarPorId(id);
        repo.deleteById(id);
        return t;
    }
}