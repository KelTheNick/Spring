package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
	
public class HelloWorldServiceSpanishImpl implements HelloWorldService {

	@Override
	public String getGreeting() {

		return "Hola Mundo!";
	}
}
