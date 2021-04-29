package com.producto.publicidad.app.persistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.producto.publicidad.app.persistence.dao.InterfResena;
import com.producto.publicidad.app.persistence.entity.Resena;
@Service
public class ResenaService implements InterfResenaService{

	@Autowired
	private InterfResena interfResena;
	
	@Override
	public List<Resena> findAll() {
		return interfResena.findAll();
	}

	@Override
	public Resena findOne(Integer id) {
		return interfResena.findById(id).get(); 
	}

	@Override
	public void delete(Integer id) {
		interfResena.deleteById(id);
		
	}
	
	

}
