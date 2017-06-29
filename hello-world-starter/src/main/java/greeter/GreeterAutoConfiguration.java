package greeter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GreeterProperties.class)
public class GreeterAutoConfiguration {

	@Bean
	public Greeter greeter(GreeterProperties properties) {
		return new Greeter(properties.getGreeting());
	}
}
