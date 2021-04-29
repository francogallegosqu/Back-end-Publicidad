package com.producto.publicidad.app.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.producto.publicidad.app.persistence.entity.Venta;

public interface InterfVenta extends JpaRepository<Venta, Long>{

}
