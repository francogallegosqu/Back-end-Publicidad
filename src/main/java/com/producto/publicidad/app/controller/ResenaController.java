package com.producto.publicidad.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.producto.publicidad.app.persistence.entity.Resena;

import com.producto.publicidad.app.persistence.service.InterfResenaService;

@RestController 
@RequestMapping("/api/comentarios")
public class ResenaController {
	@Autowired
	private InterfResenaService interfResenaService;
	
	@GetMapping(value = "/listar")
	public List<Resena> listar(){
		return interfResenaService.findAll();
	}
}
