package io.github.ruben;

import io.github.ruben.configuracion.PropiedadesSimples;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Bs4Application {

	public static void main(String[] args) {
		SpringApplication.run(Bs4Application.class, args);
	}

	@Autowired
	private PropiedadesSimples propiedadesSimples;

	@PostConstruct
	private void postInit(){
		System.out.println("Propiedades simples info....");
		System.out.println(propiedadesSimples);
	}

}
