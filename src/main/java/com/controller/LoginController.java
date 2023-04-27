package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.User;
import com.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping("/signup")
	public String redirectToSignup(HttpServletRequest incomingRequest, Model model) {
		
		return "signup";
		
	}
	@RequestMapping("/signin")
	public String redirectToLogin(HttpServletRequest req, Model model) {
		return "signin";
	}

	@RequestMapping("/validate-login")
	public String validateLogin(HttpServletRequest req, Model model) {
		System.out.println("Validater Invoked --");
		String userName = req.getParameter("userName");
		String passWord = req.getParameter("password");
		System.out.println(userName);
		System.out.println(passWord);

		if (userName.equals("Admin") && passWord.equals("Admin")) {
			model.addAttribute("userName", userName);
			return "travel-book";
		} else {
			return "error";
		}
	}
	
	@RequestMapping("/create-user")
	public String createUser(HttpServletRequest incomingRequest, Model model) {
		
		String email = incomingRequest.getParameter("email");
		String password = incomingRequest.getParameter("password");
		String confirmpassword = incomingRequest.getParameter("password");
		String dob = incomingRequest.getParameter("dob");
		
		User user = new User(email,password);
		loginService.signUpUser(user);
		model.addAttribute("email",email);
		return "travel-book";
		
	}
}
