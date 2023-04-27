package com.service;

import com.entity.BookTravel;
import com.entity.User;

public interface LoginService {

	void signUpUser(User user);

	void bookTravel(BookTravel book);
}
