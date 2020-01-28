package com.swim.app.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
	
//	@Autowired
//	private IUserService userService;
//
//	@GetMapping("/")
//	public String getHome() {
//		return "home";
//	}
//	
//	@GetMapping("/users/{id}")
//	public String getUser(Model model, @PathVariable long id) {
//		User user = userService.find(id);
//		model.addAttribute("temp", user);
//		model.addAttribute("id", id);
//
//		
//		return "user";
//	}
//	
//	@GetMapping("/users")
//	public String getUsers(Model model) {
//		List<User> users = userService.findAll();
//		model.addAttribute("users", users);
//		model.addAttribute("size", users.size());
//		return "user";
//	}
}
