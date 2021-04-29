package com.producto.publicidad.app.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.producto.publicidad.app.persistence.entity.Cliente;

public interface InterfCliente extends JpaRepository<Cliente, Long> {

//	@Query("select c from cliente where c.id:id")
//	public Cliente findOne(Long id);
	
}
