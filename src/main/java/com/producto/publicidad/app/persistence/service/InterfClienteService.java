package com.producto.publicidad.app.persistence.service;

import java.util.List;

import com.producto.publicidad.app.persistence.entity.Cliente;

public interface InterfClienteService {
	
	public List<Cliente> findAll() throws Exception ;
	public Cliente findOne(Long id) throws Exception;
	public Cliente update(Long id);
	public void delete(Long id) throws Exception;
	
}
