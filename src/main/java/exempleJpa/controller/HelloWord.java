package exempleJpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
	
	@GetMapping("")
	public String hello() {
		return "hello word !!";
	}
	
	
	
	
}
