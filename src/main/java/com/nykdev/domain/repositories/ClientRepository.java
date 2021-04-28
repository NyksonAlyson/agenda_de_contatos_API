package com.nykdev.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nykdev.domain.entities.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {
	
	// busca no banco contato por nome
	public Iterable<Client> findByfirstNameContainingIgnoreCase(String findName);
	
	// busca no banco contato por email
	public Iterable<Client> findByEmailContainingIgnoreCase(String findEmail);
	
}
