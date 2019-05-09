package com.bolsadeideas.servidor.spring.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.servidor.spring.models.dao.IClienteDAO;
import com.bolsadeideas.servidor.spring.models.entity.Cliente;

public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDAO clienteDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDAO.findAll();
	}

}
