package fr.univlittoral.javaquarium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
/*@EntityScan( basePackages = {
		"fr.univlittoral.javaquarium.model", 
		"fr.univlittoral.javaquarium.dto"
	} 
)*/
public class JavaquariumApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaquariumApplication.class, args);
	}
}
