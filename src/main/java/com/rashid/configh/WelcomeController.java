package com.rashid.configh;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {	
	@RequestMapping("/welcome")
	public String loginMessage(){
		return "welcome";
	}
	@RequestMapping("/hello")
	public String NEw(){
		return "NewFile";
	}
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}