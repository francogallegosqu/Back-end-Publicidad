package com.producto.publicidad.app.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.producto.publicidad.app.persistence.entity.Cliente;

public interface InterfCliente extends JpaRepository<Cliente, Long> {

}
