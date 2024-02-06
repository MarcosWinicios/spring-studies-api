package com.studies.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.studies.algafood.di.service.ActivationClientService;

@Configuration
public class ServiceConfig {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public ActivationClientService ativacActivationClientService() {
		return new ActivationClientService();
	}
}
