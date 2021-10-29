package com.Lucas.Backend.Livro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.Lucas.Backend.Livraria.Livraria;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class  Livro{

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		private Double preco;
		
		@NotNull
		private String nome;
		private String genero;
		private String autor;
		private String tipo;
		
		@ManyToOne
		@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
		private Livraria livraria;

		
		public Livraria getLivraria() {
			return livraria;
		}
		public void setLivraria(Livraria livraria) {
			this.livraria = livraria;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Double getPreco() {
			return preco;
		}
		public void setPreco(Double preco) {
			this.preco = preco;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public String getTipo() {
			return tipo;
		}
		public void setSTipo(String tipo) {
			this.tipo = tipo;
		}
			
}
