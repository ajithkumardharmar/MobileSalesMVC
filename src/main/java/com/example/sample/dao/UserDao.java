package com.example.sample.dao;

import java.util.List;

import com.example.sample.model.Users;

public interface UserDao {
	
	public  List<Users> getUserDetails(String email);

}
