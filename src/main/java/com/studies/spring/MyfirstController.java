package com.studies.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studies.spring.di.model.Client;
import com.studies.spring.di.service.ActivationClientService;

@Controller
public class MyfirstController {
	
	@Autowired
	private ActivationClientService activationClientService;


	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Client joao =  new Client("Joao", "joão@xyz.com", "34999998888");
		
		activationClientService.activate(joao);
		
		return "Olá";
	}
}
