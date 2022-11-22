package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {

	@GetMapping
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "BSMs: Responsabilidade Pessoal, Mentalidade de Crescimento, Orientação ao Futuro, Persistência, Comunicação, Trabalho em Equipe, Atenção aos Detalhes e Proatividade.";
	}
	
	@GetMapping("/objetivos")
	public String objetivosDaSemana() {
		return "Fazer um mini projeto java para praticar até o dia 27/11. Vou precisar disponibilizar um tempo para isso, além de buscar conteúdos na internet, youtube e plataforma da Generation.";
	}
}
