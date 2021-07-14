package com.example.demoUsr;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	public Optional<User> findByMailAndPassword(String mail, String password);
}
