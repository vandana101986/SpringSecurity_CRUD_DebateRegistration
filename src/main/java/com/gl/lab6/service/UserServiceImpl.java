package com.gl.lab6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gl.lab6.entity.User;
import com.gl.lab6.repository.UserRepository;
import com.gl.lab6.security.StudentUserDetails;

public class UserServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userrepo;

	@Override
	public UserDetails loadUserByUsername(String username) {
		User user=userrepo.getUserByUserName(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("User "+username+" not found!!!");
		}
		
		UserDetails studentUserDetails=new StudentUserDetails(user);
		return studentUserDetails;
	}

}
