package com.producto.publicidad.app.persistence.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Resenas")
public class Resena implements Serializable{
		
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer ID_Resena;
		private String Descripcion;
		private Integer IdPublicidad;
	
		
		@ManyToOne
		@JoinColumn(name="id_cliente")
		private Cliente cliente;
		
		@OneToMany
		@JoinColumn(name = "id_publicaciones")
		private Publicaciones publicacion;

		
		
		public Resena() {
			
		}
		
		
		public Integer getID_Resena() {
			return ID_Resena;
		}



		public void setID_Resena(Integer iD_Resena) {
			ID_Resena = iD_Resena;
		}



		public Cliente getCliente() {
			return cliente;
		}



		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}



		public static long getSerialversionuid() {
			return serialVersionUID;
		}



		public String getDescripcion() {
			return Descripcion;
		}
		public void setDescripcion(String descripcion) {
			Descripcion = descripcion;
		}
		public Integer getIdPublicidad() {
			return IdPublicidad;
		}
		public void setIdPublicidad(Integer idPublicidad) {
			IdPublicidad = idPublicidad;
		}
		
		private static final long serialVersionUID = 1L;
}
