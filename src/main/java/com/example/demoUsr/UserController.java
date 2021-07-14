package com.example.demoUsr;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping(value="/checkuser")
	public User addUser(String mail, String password) {
		
		User user;
		if(mail!= null && password != null) {
			Optional<User> optionalUser = userRepo.findByMailAndPassword(mail, password);
			if(optionalUser.isPresent()) {
				return optionalUser.get();
			}
		}
		
		return null;
	}

}
