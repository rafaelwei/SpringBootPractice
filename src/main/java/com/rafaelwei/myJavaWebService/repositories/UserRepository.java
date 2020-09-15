package com.rafaelwei.myJavaWebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelwei.myJavaWebService.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
