package com.Lucas.Backend.Livraria;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.Lucas.Backend.Cafeteria.Cafeteria;
import com.Lucas.Backend.Livro.Livro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Livraria{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
	private String nome;
    
    private String local;
    
    private Boolean franquia;
    
    @OneToMany(mappedBy = "livraria",targetEntity = Cafeteria.class, cascade = CascadeType.ALL)
	private List<Cafeteria> cafeteria;
    
    @OneToMany(mappedBy = "livraria",targetEntity = Livro.class, cascade = CascadeType.ALL)
	private List<Livro> livro;
    
       
        
	
	
	public List<Cafeteria> getCafeteria() {
		return cafeteria;
	}
	public void setCafeteria(List<Cafeteria> cafeteria) {
		this.cafeteria = cafeteria;
	}
	public List<Livro> getLivro() {
		return livro;
	}
	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Boolean getFranquia() {
		return franquia;
	}
	public void setFranquia(Boolean franquia) {
		this.franquia = franquia;
	}
    
    
}

