package com.studies.algafood.di.notification;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME)// Informa por quanto tempo a minha anotação deve permanesser onde for utilizada
@Qualifier
public @interface NotifierType {
	
	LevelUrgency value();
	
}
