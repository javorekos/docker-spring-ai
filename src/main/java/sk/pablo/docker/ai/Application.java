package sk.pablo.docker.ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
//			String response = client.prompt("When was Docker created?")
//					.call()
//					.content();
//
//			System.out.println(response);
//		};
//	}

//	@RestController
//	public class ChatController {
//
//		private final ChatClient chatClient;
//		private final InMemoryChatMemory memory = new InMemoryChatMemory();
//
//		public ChatController(ChatClient.Builder builder) {
//			this.chatClient = builder
//					.defaultAdvisors(new MessageChatMemoryAdvisor(memory))
//					.build();
//		}
//
//		@PostMapping("/chat")
//		public String chat(@RequestBody String prompt) {
//			return chatClient.prompt()
//					.user(prompt)
//					.call()
//					.content();
//		}
//		@GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//		public Flux<String> stream(@RequestParam String prompt) {
//			return chatClient.prompt()
//					.user(prompt)
//					.stream()
//					.content();
//		}
//	}
}
