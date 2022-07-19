package com.arthur.projetodto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.projetodto.dto.UserDTO;
import com.arthur.projetodto.entities.User;
import com.arthur.projetodto.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	public UserDTO findById(Long id) {
		User entity = repository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		return dto;
	}

}
