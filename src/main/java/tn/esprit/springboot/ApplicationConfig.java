package tn.esprit.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {
    @Bean("bean1")
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("First Bean");
    }

    @Bean("bean2")
    public MyFirstClass mySecondClass() {
        return new MyFirstClass("Second Bean");
    }

    @Bean
    // NOTE:
    // @Primary
    // This is Constructor injection
    public MyFirstClass myThirdClass() {
        return new MyFirstClass("Third Bean");
    }
}
