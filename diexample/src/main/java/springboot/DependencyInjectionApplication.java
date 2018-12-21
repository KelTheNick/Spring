package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import guru.springframework.controllers.GreetingController;

@SpringBootApplication // Annotations: Defines this application as a SpringBootApp
@ComponentScan("guru.springframework") // Java Configuration: If the packages are different, use this annotation to point to the real package
public class DependencyInjectionApplication {

    public static void main(String[] args) {
    	
    	// Defines that this application will run upon build. (Runnable App)
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        greetingController.sayHello();
    }
}
