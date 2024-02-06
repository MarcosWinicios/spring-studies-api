package com.studies.algafood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.studies.algafood.di.service.ClienteActivedEvent;

@Component
public class InssuanceTaxReceiptService {

	@EventListener
	public void clientActivedListener(ClienteActivedEvent event) {

		System.out.println("Emitindo nota fiscal para cliente " + event.getClient().getName());
	}
}
