package com.nykdev.domain.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nykdev.domain.entities.Client;
import com.nykdev.domain.repositories.ClientRepository;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {	
	
	@Autowired
	private ClientRepository clientRepository;
	
	/// Metodo para Salvar contato
	@PostMapping
	public @ResponseBody Client client(@RequestBody @Valid Client client) {
		clientRepository.save(client);
		return client;
	}
	
	// Metodo para atualizar dados de um contato
	@PutMapping
	public Client updateClient(@Valid Client client) {
		clientRepository.save(client);
		return client;
	}
	
	// Metodo para excluir um contato
		@DeleteMapping(path = "/{id}")
			public void deleteClient(@PathVariable Long id) {
			clientRepository.deleteById(id);
		}
	
	// Metodo para listar todos os contatos
	@GetMapping
	public ResponseEntity<List<Client>>listClients(){
		List<Client> list = clientRepository.findAll();
		return ResponseEntity.ok(list);	
	}

	// Metodo para encontrar um contato por Nome
	@GetMapping(path = "/name/{findName}")
	public Iterable<Client>searchByname(@PathVariable String findName){
		return clientRepository.findByfirstNameContainingIgnoreCase(findName);
	}
	
	// Metodo para encontrar um contatos por Email
	@GetMapping(path = "/email/{findEmail}")
	public Iterable<Client>searchByEmail(@PathVariable String findEmail){
		return clientRepository.findByEmailContainingIgnoreCase(findEmail);
		
	}
	
	
	
}
