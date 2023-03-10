package com.alisson.camadasormdto.dto;

import com.alisson.camadasormdto.entities.User;

public class UserDTO {

	private Long id;
	private String name;
	
	public UserDTO() {
		
	}

	public UserDTO(Long id, String nome) {
		this.id = id;
		this.name = nome;
	}
	
	public UserDTO(User user) {
		id = user.getId();
		name = user.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
