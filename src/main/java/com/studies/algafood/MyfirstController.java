package com.studies.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studies.algafood.di.model.Client;
import com.studies.algafood.di.service.ActivationClientService;

@Controller
public class MyfirstController {
	
	private ActivationClientService ativactionClientService;
	
	
	
	public MyfirstController(ActivationClientService ativactionClientService) {
		this.ativactionClientService = ativactionClientService;
		
		System.out.println("Meu primeiro controller" + ativactionClientService);
	}



	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Client joao =  new Client("Joao", "joão@xyz.com", "34999998888");
		
		ativactionClientService.activate(joao);
		
		return "Olá";
	}
}
