package com.telusko.springmvcboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.springmvcboot.model.Alien;

@Controller
public class HomeController 
{
	@Autowired
	AlienRepo repo;
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name", "Aliens");
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	@GetMapping("getAliens")
	public String getAliens(Model m)
	{
		
		m.addAttribute("result", repo.findAll());
		
		return "showAliens";
	}
	
	@PostMapping("addAlien")
	public String addAlien(Alien a)
	{

		
		return "result";	
	}
	
	
}
