package br.com.workmade.springaula01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-aula01")
public class Controller {
	
	@GetMapping()
	public String seuNome(){
		
		return "Bem-Vindo novamente Marcos";
	}

	@GetMapping("/outro")
	public String outroNome(){
		
		return "Bem-Vindo a você também";
	}
}
