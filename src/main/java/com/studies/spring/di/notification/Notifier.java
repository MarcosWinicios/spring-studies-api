package com.studies.algafood.di.notification;

import com.studies.algafood.di.model.Client;

public interface Notifier {
	
	void notify(Client client, String message);
}
