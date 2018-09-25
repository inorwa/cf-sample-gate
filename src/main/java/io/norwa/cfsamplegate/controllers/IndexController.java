package io.norwa.cfsamplegate.controllers;

import io.norwa.cfsamplegate.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/")
	public String index(Model model){
		model.addAttribute("users",userRepository.findAll());
		return "index";
	}
}
