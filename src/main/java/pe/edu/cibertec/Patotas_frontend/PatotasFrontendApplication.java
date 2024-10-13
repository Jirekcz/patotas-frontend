package pe.edu.cibertec.Patotas_frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PatotasFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatotasFrontendApplication.class, args);
	}


}
