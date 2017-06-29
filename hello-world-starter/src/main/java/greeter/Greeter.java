package greeter;

import org.springframework.beans.factory.annotation.Autowired;

public class Greeter {

	@Autowired
	private GreeterProperties properties;

	public String greet(String name) {
		return String.format("%s %s%n", properties.getGreeting(), name);
	}
}
