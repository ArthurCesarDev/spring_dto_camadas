package com.arthur.projetodto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.projetodto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
