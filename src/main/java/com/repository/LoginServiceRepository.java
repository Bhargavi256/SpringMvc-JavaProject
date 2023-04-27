package com.repository;

import com.entity.BookTravel;
import com.entity.User;

public interface LoginServiceRepository {

	void signUpUser(User user);

	void bookTravel(BookTravel book);

}
