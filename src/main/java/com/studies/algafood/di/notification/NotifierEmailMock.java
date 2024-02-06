package com.studies.algafood.di.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.studies.algafood.di.model.Client;

@Profile("dev")
@NotifierType(LevelUrgency.NO_URGENCY)
@Component
public class NotifierEmailMock implements Notifier {
	
	public NotifierEmailMock() {
		System.out.println("NotificadorEmail MOCK");
	}

	@Override
	public void notify(Client client, String message) {

		System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s : %s\n", client.getName(), client.getEmail(), message);
	}

}
