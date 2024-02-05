package com.studies.algafood.di.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.studies.algafood.di.model.Client;

@Qualifier("urgent")
@Component
public class NotifierSMS implements Notifier{
	

	@Override
	public void notify(Client client, String message) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				client.getName(), client.getPhone(), message);
		
	}
	
}
