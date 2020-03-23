package com.bs.lec16Pjt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("home ��Ʈ�ѷ� ���� --- ");
		model.addAttribute("key", "Home ��Ʈ�ѷ� �Դϴ�.");
		
		return "home";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		System.out.println("login ��Ʈ�ѷ� ���� --- ");
		model.addAttribute("key", "Login ��Ʈ�ѷ� �Դϴ�.");
		
		return "login";
	}

}
