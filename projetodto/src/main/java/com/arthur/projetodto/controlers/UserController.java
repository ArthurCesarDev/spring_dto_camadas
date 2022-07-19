package com.arthur.projetodto.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthur.projetodto.dto.UserDTO;
import com.arthur.projetodto.service.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserServices service;
	
	@GetMapping(value = "/{id}")
	public  UserDTO findByid(@PathVariable Long id) {
		return service.findById(id);
	}
}
