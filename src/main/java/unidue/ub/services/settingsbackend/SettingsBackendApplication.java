package unidue.ub.services.settingsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:3000")
@EntityScan("unidue.ub.settings.fachref")
public class SettingsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SettingsBackendApplication.class, args);
	}
}
