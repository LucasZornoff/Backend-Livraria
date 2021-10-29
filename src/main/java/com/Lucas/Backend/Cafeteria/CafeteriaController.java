package com.Lucas.Backend.Cafeteria;

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
@RequestMapping("/cafeteria")
@AllArgsConstructor
public class CafeteriaController {

		@Autowired
		CafeteriaRepository repository;
		
		@GetMapping("/retornatodos")
		List<Cafeteria> todasCafeterias(){
			return repository.findAll();
		}
		
		@PostMapping("/novo")
		Cafeteria novoCafeteria(@RequestBody Cafeteria cafeteria) {
	        return repository.save(cafeteria);
	    }
		
		@GetMapping("/{id}")
		Optional<Cafeteria> retornaCafeteria(@PathVariable Long id) {
			return repository.findById(id);
		}
		
		@PutMapping("/{id}")
		Cafeteria atualizaCafeteria(@RequestBody Cafeteria cafeteria, @PathVariable Long id) {
			cafeteria.setId(id);
			return repository.save(cafeteria);
		}
		
		@DeleteMapping("/deleta/{id}")
		void deletaAfiliado(@PathVariable Long id) {
			repository.deleteById(id);
				}
		
		@GetMapping("/retornaTodosDaLivraria/{id}")
		List<Cafeteria> todosLivrosdaLivraria(@PathVariable Long id){
			return repository.findAllByLivraria(id);
		}

		
}
