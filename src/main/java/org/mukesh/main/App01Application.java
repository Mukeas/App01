package org.mukesh.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class App01Application {
	private static Logger log = LoggerFactory.getLogger(App01Application.class);

	public static void main(String[] args) {
		SpringApplication.run(App01Application.class, args);
		log.info("-------------Hrllo main class of application------------");
	}

	
}
