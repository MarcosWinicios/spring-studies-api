package com.studies.algafood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studies.algafood.di.model.Client;
import com.studies.algafood.di.notification.Notifier;

@Component
public class ActivationClientService {

	@Autowired
	private List<Notifier> notifiers;

	public void activate(Client client) {
		client.activate();
		
		for(Notifier notifier : notifiers) {
			
			notifier.notify(client, "Seu Cadastro no sistema está ativo!");
		}
		

	}

}
