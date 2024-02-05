package com.studies.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.studies.algafood.di.model.Client;
import com.studies.algafood.di.notification.Notifier;

@Component
public class ActivationClientService {
	
	@Qualifier("urgent")
	@Autowired
	private Notifier notifier;

	public void activate(Client client) {
		client.activate();

		notifier.notify(client, "Seu Cadastro no sistema está ativo!");

	}

}
