package com.bmt.projectpibj.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"", "/"})
	public String home() {
		return "index";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	
	@PreAuthorize("isAuthenticated()")
	@GetMapping("/store/user")
	public String userPage() {
		return "user";
	}
	
	@PreAuthorize("hasRole('client')")
	@GetMapping("/store/client")
	public String clientPage() {
		return "client";
	}
	
	@PreAuthorize("hasRole('admin')")
	@GetMapping("/store/admin")
	public String adminPage() {
		return "admin";
	}
}

































