package com.hugo.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* PROJETO SPRING BOOT GERADO VIA SPRING INITIALIZR.
* OS SEGUINTES MODULOS FORAM SELECIONADOS
* -SPRING DATA JPA
* -SPRING WEB
* -H2 DATABASE
* -OPENFEIGN
*
* @author falvojr
* */
@EnableFeignClients  //ANOTATION HABILITA O FEIGN DENTRO DO NOSSO PROJETO
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
