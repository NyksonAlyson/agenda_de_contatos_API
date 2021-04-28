package com.nykdev.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
// cria tabela de clientes no banco
@Table(name = "tb_client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotBlank(message = "O nome não pode ser vazio")
	private String firstName;
	@NotBlank(message = "O nome não pode ser vazio")
	private String lastName;
	@NotBlank(message = "O email não pode ser vazio")
	private String email;
	@NotBlank(message = "O o fone não pode ser vazio")
	private String fone1;
	
	private String fone2;
	
	
	public Client() {	
		
	}

	public Client(long id, String firstName, String lastName, String email, String fone1, String fone2) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.fone1 = fone1;
		this.fone2 = fone2;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone1() {
		return fone1;
	}

	public void setFone1(String fone1) {
		this.fone1 = fone1;
	}

	public String getFone2() {
		return fone2;
	}

	public void setFone2(String fone2) {
		this.fone2 = fone2;
	}

	
	
}
