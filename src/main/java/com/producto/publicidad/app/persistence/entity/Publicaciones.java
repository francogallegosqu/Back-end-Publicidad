package com.producto.publicidad.app.persistence.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Publicaciones")
public class Publicaciones implements Serializable {

	@Id
	private Integer Id_publicacion;
	private String Descripcion;
	private LocalDate Fecha;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "publicaciones", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Resena> resenas;
	
	public Publicaciones() {

	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public LocalDate getFecha() {
		return Fecha;
	}

	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}

	private static final long serialVersionUID = 1L;

}
