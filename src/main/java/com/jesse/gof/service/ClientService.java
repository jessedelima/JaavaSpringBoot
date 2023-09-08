package com.hugo.gof.service;

import com.hugo.gof.model.Cliente;

//OPERAÇÕES DE CRUD
public interface ClientService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
