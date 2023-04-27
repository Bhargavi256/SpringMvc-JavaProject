package com.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.BookTravel;
import com.entity.User;
import com.repository.LoginServiceRepository;
import com.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginServiceRepository loginServiceRepository;

	@Override
	public void signUpUser(User user) {
		loginServiceRepository.signUpUser(user);
		System.out.println("Service invoked");
		
	}

	@Override
	public void bookTravel(BookTravel book) {
		loginServiceRepository.bookTravel(book);
		System.out.println("Service Invoked");
		
	}

}
