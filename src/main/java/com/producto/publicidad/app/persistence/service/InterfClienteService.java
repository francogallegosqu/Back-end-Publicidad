package com.producto.publicidad.app.persistence.service;

import java.util.List;

import com.producto.publicidad.app.persistence.entity.Cliente;

public interface InterfClienteService {
	
	public List<Cliente> findAll();
	public Cliente findOne(Long id);
	public void delete(Long id);

}
