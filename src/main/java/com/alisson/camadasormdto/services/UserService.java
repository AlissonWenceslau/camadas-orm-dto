package com.alisson.camadasormdto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alisson.camadasormdto.dto.UserDTO;
import com.alisson.camadasormdto.entities.User;
import com.alisson.camadasormdto.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	//Chama a busca de usuário do repositório e retorna um DTO para o controlador
	public UserDTO findById(Long id) {
		User entity = repository.findById(id).get();
		//Converte 'User' para 'UserDTO'
		UserDTO dto = new UserDTO(entity);
		return dto;
	}
}
