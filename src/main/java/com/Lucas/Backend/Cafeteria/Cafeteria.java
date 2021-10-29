package com.Lucas.Backend.Cafeteria;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.Lucas.Backend.Livraria.Livraria;
import com.Lucas.Backend.Livro.Livro;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cafeteria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String cafe;

	private String descricao;

	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Livraria livraria;

	public Livraria getLivraria() {
		return livraria;
	}

	public void setLivraria(Livraria livraria) {
		this.livraria = livraria;
	}

	public String getCafe() {
		return cafe;
	}

	public void setCafe(String cafe) {
		this.cafe = cafe;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
