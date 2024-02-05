package com.studies.algafood.di.service;

import com.studies.algafood.di.model.Client;
import com.studies.algafood.di.model.Product;
import com.studies.algafood.di.notification.Notifier;

public class InssuanceTaxReceiptService {
	
private Notifier notificador;
	
	public InssuanceTaxReceiptService(Notifier notificador) {
		this.notificador = notificador;
	}
	
	public void emitir(Client cliente, Product produto) {
		
		//TODO: Implementa emissão da nota fiscal		
		notificador.notify(cliente, "Nota fiscao do produto " + produto.getNome() + " foi emitida!");
	}
	
}
