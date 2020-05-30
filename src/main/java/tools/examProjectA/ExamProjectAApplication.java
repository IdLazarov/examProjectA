package tools.examProjectA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExamProjectAApplication {
	
	@GetMapping("/")
	String Greetings() {
		return "Hello exam of tools";
	}

	public static void main(String[] args) {
		SpringApplication.run(ExamProjectAApplication.class, args);
	}

	
}


