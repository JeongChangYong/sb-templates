package kr.co.kalpa.sbtemplates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class Sbtemplates1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sbtemplates1Application.class, args);
	}
	@RequestMapping("/")
	public String main() {
		
		return "main";
	}

}
