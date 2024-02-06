package com.studies.spring.di.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.studies.spring.di.model.Client;

@NotifierType(LevelUrgency.NO_URGENCY)
@Component
public class NotifierEmail implements Notifier {
	
	@Autowired
	private NotifierProperties properties;
	
	@Override
	public void notify(Client client, String message) {
		
		System.out.println("Host: " + properties.getHostServer());
		System.out.println("Port: " + properties.getPortServer());

		System.out.printf("Notificando %s através do e-mail %s : %s\n", client.getName(), client.getEmail(), message);
	}

}
