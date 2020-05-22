package io.github.mrspock182.desacoplamento.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import io.micronaut.runtime.Micronaut;

@SpringBootApplication
public class DesacoplamentoFrameworkApplication {

	public static void main(String[] args) {
//		Micronaut.run(DesacoplamentoFrameworkApplication.class);
		SpringApplication.run(DesacoplamentoFrameworkApplication.class, args);
	}

}
