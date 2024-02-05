package com.studies.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studies.algafood.di.model.Client;
import com.studies.algafood.di.notification.LevelUrgency;
import com.studies.algafood.di.notification.Notifier;
import com.studies.algafood.di.notification.NotifierType;

@Component
public class ActivationClientService {
	
	@NotifierType(LevelUrgency.NO_URGENCY)
	@Autowired
	private Notifier notifier;

	public void activate(Client client) {
		client.activate();

		notifier.notify(client, "Seu Cadastro no sistema está ativo!");

	}

}
