package fr.cesi.ril17.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Done by @SpringBootApplication
-------
@Configuration
@ComponentScan(basePackages = {
	"fr.cesi.ril17.spring.demo.*"	
})*/
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
