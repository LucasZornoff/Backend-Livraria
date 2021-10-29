package com.Lucas.Backend.Livro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lucas.Backend.Livraria.Livraria;
import com.Lucas.Backend.Livraria.LivrariaRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/livro")
@AllArgsConstructor
public class LivroController {

	@Autowired
	LivroRepository repository;

	@GetMapping("/livrarias")
	List<Livro> todosLivros() {
		return repository.findAll();
	}

	@PostMapping("/novo")
	Livro novoLivro(@RequestBody Livro livro) {
		return repository.save(livro);
	}

	@GetMapping("/{id}")
	Optional<Livro> retornaLivro(@PathVariable Long id) {
		return repository.findById(id);
	}

	@PutMapping("/{id}")
	Livro atualizaLivro(@RequestBody Livro livro, @PathVariable Long id) {
		livro.setId(id);
		return repository.save(livro);
	}

	@DeleteMapping("/deleta/{id}")
	void deletaLivro(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@GetMapping("/retornaTodosDaLivraria/{id}")
	List<Livro> todosLivrosdaLivraria(@PathVariable Long id){
		return repository.findAllByLivraria(id);
	}

}
