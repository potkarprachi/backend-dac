package com.efarmer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efarmer.dao.LoginDao;
import com.efarmer.model.Login;



@Service
public class LoginServiceImpl implements LoginService
{
	@Autowired
	private LoginDao loginDao;
	
	@Override
	public void insert(Login user) 
	{
		loginDao.save(user);
		
	}

	@Override
	public Login check(Login user) 
	{
		Login cUser=loginDao.checkUser(user.getEmail(),user.getPassword());
			return cUser;
	}
	
	@Override
	public Login getDetails(int id)
	{
		Login cUser=loginDao.getInfo(id);
		return cUser;
	}
	@Override
	public Login update(Login user) 
	{
		Login cUser=loginDao.save(user);
		return cUser;
		
	}
	
	

}
