package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.entity.BookTravel;
import com.entity.User;

@Repository
public class LoginServiceRepositoryImpl implements LoginServiceRepository{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void signUpUser(User user) {
		
		int rowcount = jdbcTemplate.update("insert into user(`email`, `password`) VALUES (?, ?)",user.getEmail(),user.getPassword());
		System.out.println("roes inserted"+rowcount);
	}

	@Override
	public void bookTravel(BookTravel book) {
		int rowcount = jdbcTemplate.update("insert into book_travel(`from_address`,`to_address`) VALUES (?,?)",book.getFrom_address(),book.getTo_address());
		System.out.println("row has been updates"+rowcount);
	}

}
