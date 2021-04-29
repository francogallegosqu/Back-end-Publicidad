package com.producto.publicidad.app.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.producto.publicidad.app.persistence.entity.Resena;

public interface InterfResena  extends JpaRepository<Resena, Integer>{
	
	
}
