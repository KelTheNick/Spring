package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

public class HelloWorldServiceEnglishImpl implements HelloWorldService {

	@Override
	public String getGreeting() {

		return "Hello World!";
	}
}
