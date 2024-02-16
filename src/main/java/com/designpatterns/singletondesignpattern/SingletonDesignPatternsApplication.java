package com.designpatterns.singletondesignpattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonDesignPatternsApplication {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Singleton singleton = Singleton.getSingleton();
		}

	}
}
