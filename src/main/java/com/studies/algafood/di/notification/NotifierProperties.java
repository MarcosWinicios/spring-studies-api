package com.studies.algafood.di.notification;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@ConfigurationProperties("notifier.email")
public class NotifierProperties {
	
	/**
	 * Email Server Host
	 */
	private String hostServer;
	
	/**
	 * Email Server port
	 */
	private Integer portServer = 25;
}
