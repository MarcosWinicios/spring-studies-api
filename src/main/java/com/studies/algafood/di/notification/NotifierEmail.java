package com.studies.algafood.di.notification;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.studies.algafood.di.model.Client;

@NotifierType(LevelUrgency.NO_URGENCY)
@Component
public class NotifierEmail implements Notifier {
	
	@Value("${notifier.email.host-server}")
	private String host;
	
	@Value("${notifier.email.port-server}")
	private Integer port;
	
	@Override
	public void notify(Client client, String message) {
		
		System.out.println("Host: " + host);
		System.out.println("Port: " + port);

		System.out.printf("Notificando %s através do e-mail %s : %s\n", client.getName(), client.getEmail(), message);
	}

}
