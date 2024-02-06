package com.studies.algafood.di.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.studies.algafood.di.model.Client;

@Profile("prod")
@NotifierType(LevelUrgency.NO_URGENCY)
@Component
public class NotifierEmail implements Notifier {

	public NotifierEmail() {
		System.out.println("NotificadorEmail REAL");
	}
	
	@Override
	public void notify(Client client, String message) {

		System.out.printf("Notificando %s através do e-mail %s : %s\n", client.getName(), client.getEmail(), message);
	}

}
