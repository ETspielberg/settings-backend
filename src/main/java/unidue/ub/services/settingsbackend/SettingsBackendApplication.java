package unidue.ub.services.settingsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@EntityScan("unidue.ub.settings.fachref")
@SpringBootApplication
@EnableEurekaClient
public class SettingsBackendApplication extends WebSecurityConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(SettingsBackendApplication.class, args);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic()
				.and()
				.authorizeRequests()
				.anyRequest().authenticated().and()
				.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
	}
}
