package com.bolsadeideas.servidor.spring.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.servidor.spring.models.entity.Cliente;

public interface IClienteDAO extends CrudRepository<Cliente, Long> {

}
