package com.producto.publicidad.app.persistence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.producto.publicidad.app.persistence.dao.InterfCliente;
import com.producto.publicidad.app.persistence.entity.Cliente;

@Service
public class ClienteService implements InterfClienteService {

	@Autowired
	private InterfCliente interfCliente;

	@Override
	public List<Cliente> findAll() throws Exception {
		List<Cliente> clientes = null;
		try {
			clientes = interfCliente.findAll();
		} catch (Exception e) {
			throw new Exception();
		}
		return clientes;
	}

	@Override
	public Cliente findOne(Long id) throws Exception {
		Optional<Cliente> cliente = null;
		try {
			cliente = interfCliente.findById(id);
		} catch (Exception e) {
			throw new Exception();
		}

		Cliente clienteObtenido = cliente.get();
		return clienteObtenido;
	}

	@Override
	public void delete(Long id) throws Exception {
		try {

			interfCliente.deleteById(id);
		} catch (Exception e) {
			throw new Exception();
		}

	}

	@Override
	public Cliente update(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
