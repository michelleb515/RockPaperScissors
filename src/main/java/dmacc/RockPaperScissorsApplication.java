//This file is the heart of any Spring Boot project.  
//Any subsequent configs (ie beans subject to Inversion of Control 
//or components that you wish to make available for dependency injection 
//in other parts of the program) will be config'd here.

package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RockPaperScissorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RockPaperScissorsApplication.class, args);
	}

}
