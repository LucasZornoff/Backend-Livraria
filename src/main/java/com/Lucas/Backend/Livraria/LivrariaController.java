package com.Lucas.Backend.Livraria;

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

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/livrarias")
@AllArgsConstructor
public class LivrariaController {

		@Autowired
		LivrariaRepository repository;
		
		@GetMapping("/retornatodas")
		List<Livraria> todasLivrarias(){
			return repository.findAll();
		}
		
		@PostMapping("/novo")
		Livraria novaLivraria(@RequestBody Livraria livraria) {
	        return repository.save(livraria);
	    }
		
		@GetMapping("/{id}")
		Optional<Livraria> retornaLivraria(@PathVariable Long id) {
			return repository.findById(id);
		}
		
		@PutMapping("/{id}")
		Livraria atualizaLivraria(@RequestBody Livraria livraria, @PathVariable Long id) {
			livraria.setId(id);
			return repository.save(livraria);
		}
		
		@DeleteMapping("/deleta/{id}")
		void deletaLivraria(@PathVariable Long id) {
			
		}
		
}
