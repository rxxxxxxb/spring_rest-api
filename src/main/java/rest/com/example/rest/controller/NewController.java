package rest.com.example.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class NewController {
	
	@RequestMapping("/print")
	public String printElement() {
		return "Hello From the other Side";
	};

}
