package example;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FunctionConfiguration {
	public static void main(String[] args) {
        //SpringApplication.run(CloudFunctionApplication.class, args);
		System.out.println(myfunc());
    }
    @Bean
    public static Function<String, String> myfunc() {
        return value ->"Shubham";
    }
}
