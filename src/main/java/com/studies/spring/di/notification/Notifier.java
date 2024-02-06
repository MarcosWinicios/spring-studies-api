package com.studies.spring.di.notification;

import com.studies.spring.di.model.Client;

public interface Notifier {
	
	void notify(Client client, String message);
}
