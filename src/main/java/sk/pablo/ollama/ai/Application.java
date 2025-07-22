package sk.pablo.ollama.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//System.out.println("Running");
	}


//	@Bean
//	CommandLineRunner commandLineRunner(ChatClient.Builder builder) {
//		return args -> {
//		    var client = builder.build();
//			String response = client.prompt("When was Ollama created?")
//					.call()
//					.content();
//
//			System.out.println(response);
//		};
//	}

}
