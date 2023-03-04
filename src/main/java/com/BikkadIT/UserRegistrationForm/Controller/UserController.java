package com.BikkadIT.UserRegistrationForm.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BikkadIT.UserRegistrationForm.model.User;

@Controller
public class UserController {

	@GetMapping("/LoadingForm")
	public String loadForm()
	{
		return "userReg";
	}
	
	
	@GetMapping("/saveUSer")
	public String saveUser(User user, Model model)
	{
		System.out.println(user);
		model.addAttribute("USER", user);
		
		return "userSuccess";
	}
}

// First Run Program as SpringBoot App (Your Server will be ON)
// Then hit url on browser "localhost:9090/LoadingForm"
// Then HandlerMapper find Controller by using  Corr. url  & report to DispatcherServlet that it is UserController 
// Then Inside loadForm() method "userReg.jsp" page will call.
// Then registration form will be displayed to End user i.e. Front end
// After filling form by user & clicking Register button, "/saveUser" form action is called & method is "get" & cntrol goes to Method on which "/saveUser" url is found.
// In form, attributes name and variable name in User class must be same
// After clicking Register button, with attributes name by using Setter-getter, values will be set to the User object
// Then in saveUser() method User Object has got values, and User object will be set in key-value format, and data will be available to key "USER"
// By using key, data will be render on "userSuccess.jsp" page & from key, fname is getting to print the message to End user