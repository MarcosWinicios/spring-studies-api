package com.studies.spring.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.studies.spring.di.notification.LevelUrgency;
import com.studies.spring.di.notification.Notifier;
import com.studies.spring.di.notification.NotifierType;
import com.studies.spring.di.service.ClienteActivedEvent;


@Component
public class NotificationService {
	
	@NotifierType(LevelUrgency.NO_URGENCY)
	@Autowired
	private Notifier notifier;
	
	@EventListener
	public void clientActivedListener(ClienteActivedEvent event) {
		
		notifier.notify(event.getClient(), "Seu cadastro no sistema está ativo!");
	}
}
