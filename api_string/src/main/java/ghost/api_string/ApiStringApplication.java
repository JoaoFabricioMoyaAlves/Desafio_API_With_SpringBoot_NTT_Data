package ghost.api_string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  // isso aqui ta habilitando o servidor eureca

@SpringBootApplication
public class ApiStringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiStringApplication.class, args);
	}

}
