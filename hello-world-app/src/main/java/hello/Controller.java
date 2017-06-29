package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import greeter.Greeter;

@RestController
public class Controller {

	@Autowired
	private Greeter greeter;

	@PostMapping
	public String apply(@RequestBody String name) {
		return greeter.greet(name);
	}
}
