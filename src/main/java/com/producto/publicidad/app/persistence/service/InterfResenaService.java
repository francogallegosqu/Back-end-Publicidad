package com.producto.publicidad.app.persistence.service;

import java.util.List;
import com.producto.publicidad.app.persistence.entity.Resena;

public interface InterfResenaService {
	public List<Resena>  findAll();
	public Resena findOne(Integer id);
	public void delete(Integer id);
}
