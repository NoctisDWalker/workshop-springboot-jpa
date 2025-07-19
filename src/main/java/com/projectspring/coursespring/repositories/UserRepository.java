package com.projectspring.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.coursespring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
