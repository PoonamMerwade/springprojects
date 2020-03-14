package com.cts.swmb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	@Value("#{${app.title}}")
	private String appTitle;
	
	@GetMapping({"","/","/home"})
	public ModelAndView defaultGetRequestHandler() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		mv.addObject("pageTitle","Home page-Welcome");
		mv.addObject("developers",new String[] {"poo","shri"});
		return mv;
	}
	@RequestMapping("/header")
	public ModelAndView getHeaderPage() {
		return new ModelAndView("header","appTitle",appTitle);
	}
	@RequestMapping("/footer")
	public String getFooterPage() {
		return "footer";
	}
	@GetMapping("/hello")
	public ModelAndView sayHello(@RequestParam(name="salut",required=false,defaultValue="Mr") String salutation,
			@RequestParam(name="unm",required=false,defaultValue="Somebody") String userName)
	
	{
		return new ModelAndView("helloPage","msg","Hello!" +userName);
	}
}
