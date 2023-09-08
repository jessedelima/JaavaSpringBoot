package com.hugo.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
* Repository e a interface que irá prover todos os metodos de acesso aos dados daquela
* determinada @Ententy
*
*
* */
@Repository
public interface ClientRepository extends CrudRepository<Cliente,Long> {

}
