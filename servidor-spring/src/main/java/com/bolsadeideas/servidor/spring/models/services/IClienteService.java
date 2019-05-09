package com.bolsadeideas.servidor.spring.models.services;

import java.util.List;

import com.bolsadeideas.servidor.spring.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

}
