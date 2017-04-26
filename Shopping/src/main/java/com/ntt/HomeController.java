package com.ntt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public ModelAndView goToHome() {
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("message", "thanks for visiting shoppingcart");
		return mv;
	}

	/*
	 * @RequestMapping("/save") public ModelAndView
	 * loginAction(@RequestParam("userName") String
	 * userN, @RequestParam("password") String pass) { ModelAndView mav = new
	 * ModelAndView(); if (userN.equals("rahul")) {
	 * 
	 * mav.addObject("successMsg", "SuccessFully Logged in........");
	 * mav.setViewName("success"); {
	 * 
	 * return mav;
	 * 
	 * }
	 * 
	 * } }
	 * 
	 
}
*/
	
}