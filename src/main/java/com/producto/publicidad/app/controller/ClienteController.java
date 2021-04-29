package com.producto.publicidad.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producto.publicidad.app.persistence.entity.Cliente;
import com.producto.publicidad.app.persistence.service.InterfClienteService;

@RestController 
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private InterfClienteService interfClienteService;
	
	@GetMapping(value = "/listar")
	public List<Cliente> listar() throws Exception{
		return interfClienteService.findAll();
	}
	
	@GetMapping(value = "/cliente/{id}")
	public Cliente obtenerCliente(@PathVariable(value = "id") Long id) throws Exception {
		return interfClienteService.findOne(id);
	}
	
	@GetMapping(value = "/cliente-eliminar/{id}")
	public void eliminar(@PathVariable(value ="id") Long id) throws Exception {
		interfClienteService.delete(id);
	}
}
