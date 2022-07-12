package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author victor.franca
 *
 */
@SpringBootApplication
@ComponentScan({ "com" })
public class MavenProjectTemplateApp {

	public static void main(String[] args) {

		SpringApplication.run(MavenProjectTemplateApp.class, args);

	}

}
