package guru.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldServiceSpanishImpl;

@Configuration // Normally used when you're using a third party application. When include JARs into project and it's blackboxed
public class HelloConfig {

	@Bean
	@Profile({"default", "english"})
	public HelloWorldServiceEnglishImpl helloWorldServiceEnglishImpl() {
		
		return new HelloWorldServiceEnglishImpl();
	}
	
	@Bean
	@Profile("spanish")
	public HelloWorldServiceSpanishImpl helloWorldServiceSpanishImpl() {
		
		return new HelloWorldServiceSpanishImpl();
	}
}