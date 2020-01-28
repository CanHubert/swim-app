package com.swim.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swim.app.entity.User;
import com.swim.app.services.IUserService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class RestUsersController {
	
//	@Autowired
//	private IUserService userService;
//	
//	
//	@GetMapping("v1/users/{id}")
//	public User getUser(@PathVariable long id) {
//		User user = userService.find(id);
//		return user;
//	}
//	
//	@GetMapping("/users")
//	public List<User> getUsers(){
//		return userService.findAll();
//	}
//	
//	@PostMapping("/users")
//	public User saveUser(@RequestBody User user) {
//		userService.save(user);
//		return user;
//	}
}
