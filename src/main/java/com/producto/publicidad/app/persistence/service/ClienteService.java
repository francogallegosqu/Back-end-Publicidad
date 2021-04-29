package com.producto.publicidad.app.persistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.producto.publicidad.app.persistence.dao.InterfCliente;
import com.producto.publicidad.app.persistence.entity.Cliente;

@Service
public class ClienteService implements InterfClienteService {

	@Autowired
	private InterfCliente interfCliente;
	
	@Override
	public List<Cliente> findAll() {
		
		return interfCliente.findAll();
	}

	@Override
	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
