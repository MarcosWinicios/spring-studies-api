package com.studies.algafood.di.notification;

import org.springframework.stereotype.Component;

import com.studies.algafood.di.model.Client;

@NotifierType(LevelUrgency.NO_URGENCY)
@Component
public class NotifierEmail implements Notifier {

	@Override
	public void notify(Client client, String message) {

		System.out.printf("Notificando %s através do e-mail %s : %s\n", client.getName(), client.getEmail(), message);
	}

}
