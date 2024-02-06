package com.studies.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.studies.algafood.di.model.Client;

@Component
public class ActivationClientService {
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void activate(Client client) {
		client.activate();
		
		// dizer para o containser que o cliente está ativo neste momento
		
		eventPublisher.publishEvent(new ClienteActivedEvent(client));
	}

}
