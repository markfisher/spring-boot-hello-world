package greeter;

public class Greeter {

	private String greeting;

	public Greeter(String greeting) {
		this.greeting = greeting;
	}

	public String greet(String name) {
		return String.format("%s %s%n", this.greeting, name);
	}
}
