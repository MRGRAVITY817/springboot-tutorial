package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		// main function will fire up the spring application
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
