package com.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.BookTravel;
import com.service.LoginService;

@Controller
public class TravelController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping("/book-travel")
	public String redirectToTravel(HttpServletRequest incomingRequest, Model model) {
		
		String from_address = incomingRequest.getParameter("from_address");
		String to_address = incomingRequest.getParameter("to_address");
		String travel_date = incomingRequest.getParameter("travel_date");
		
		System.out.println(String.format("from address is %s and to addresss is %s on date %s",from_address,to_address,travel_date));
		BookTravel book = new BookTravel(from_address,to_address);
		loginService.bookTravel(book);
		return "success";
		
	}
}
