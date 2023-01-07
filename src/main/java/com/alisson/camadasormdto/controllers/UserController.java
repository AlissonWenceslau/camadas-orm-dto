package com.alisson.camadasormdto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alisson.camadasormdto.dto.UserDTO;
import com.alisson.camadasormdto.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping(value ="/{id}")
	public UserDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
