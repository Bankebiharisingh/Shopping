package com.ntt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

@Controller
public class UserController {

	@Autowired
	UserDAO userDAO;
	@Autowired
	User user;

	// method1 for Registration
	@RequestMapping("RegistrationPage")
	public String getRegPage(Model model) {
		model.addAttribute("regobject", user);
		return "Registration";
	}

	// method2 for Registration
	@RequestMapping(value = "/customer/registration", method = RequestMethod.POST)
	public String registerCustomer(@ModelAttribute(name = "regobject") User user) {
		userDAO.save(user);
		return "Home";

	}

	
	
	@RequestMapping("LoginPage")
	public String loginPage(Model model) {
		model.addAttribute("loginobject", user);

		return "Login";
	}

	@RequestMapping("validate")
	public ModelAndView login(@RequestParam("name") String name, @RequestParam("password") String password)

	{
		ModelAndView mv = new ModelAndView("/userHome");
		if (userDAO.validate(name, password) == true) {
			System.out.println("true&******************************************************************************");
			user = userDAO.get(name);
			mv.addObject("mesage", "Welcome" + user.getName());
		} else {
			mv.addObject("message", "Invalid credential..please try again.");
		}
		return mv;
	}

}
