package io.export.exportadora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeUserController {

	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
