package br.com.javabeer.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.javabeer.springboot.model.Person;

@RestController
public class JavaBeerRestController {
	
	@RequestMapping(
			value="/", 
			method= RequestMethod.GET
		)
	public @ResponseBody String hello() {
		return "Olá, você criou um projeto Spring Boot";
	}
	
	@RequestMapping(
			value="get-person",
			method=RequestMethod.GET
		)
	public Person getPerson() {
		return 
				new Person(
					01L, 
					"Francisco", 
					"Almeda", 
					"francisco.almeida@javabeer.com.br"
				);
	}
}

