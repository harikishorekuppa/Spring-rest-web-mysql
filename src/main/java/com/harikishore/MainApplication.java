package com.harikishore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.harikishore.dao")
public class MainApplication {



	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	


}
