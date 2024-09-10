package com.mexisoft.Jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class JwtController {
	
	@GetMapping("/acceso")
	public String getString() {
		
		return "Bienvenido, el token es correcto";
	}

}
