package com.studies.spring.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.studies.spring.di.service.ClientActivedEvent;

@Component
public class InssuanceTaxReceiptService {

	@EventListener
	public void clientActivedListener(ClientActivedEvent event) {

		System.out.println("Emitindo nota fiscal para cliente " + event.getClient().getName());
	}
}
