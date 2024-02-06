package com.studies.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.studies.algafood.di.model.Client;
import com.studies.algafood.di.notification.LevelUrgency;
import com.studies.algafood.di.notification.Notifier;
import com.studies.algafood.di.notification.NotifierType;

//@Component
public class ActivationClientService {
	
	@NotifierType(LevelUrgency.NO_URGENCY)
	@Autowired
	private Notifier notifier;
	
//	@PostConstruct
	public void init() {
		System.out.println("INIT " + notifier);
	}
	
//	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}

	public void activate(Client client) {
		client.activate();

		notifier.notify(client, "Seu Cadastro no sistema está ativo!");

	}

}
