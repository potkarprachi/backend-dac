package com.efarmer.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efarmer.dao.LoginDao;
import com.efarmer.model.Login;



@Service
public class LoginServiceImpl implements LoginService
{
	@Autowired
	private LoginDao loginDao;
	Login cUser;
 
	
	@Override
	public void insert(Login user) 
	{
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
		loginDao.save(user);
	}
    
	@Override
	public Login check(Login user) 
	{
	 cUser  = loginDao.checkUser(user.getEmail());
	 boolean flag=BCrypt.checkpw(user.getPassword() ,cUser.getPassword());
	  System.out.println(flag);
	 if(flag)
	 {
		 	System.out.println(cUser.getEmail()+", : "+cUser.getPassword());
		  return cUser;
	  
	 }
	  else
	  {
		  System.out.println("User Not Found");
		  return null;
	  }
	  	
	}
	
	private boolean checkPass(Login user) 
	{
		System.out.println(user.getPassword() +"   "+ cUser.getPassword());
		return (BCrypt.checkpw(user.getPassword() ,cUser.getPassword()));
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

	@Override
	public String passwordUpdate(String email,String password) {
		System.out.println(email);
	  Login	cUsertemp  = loginDao.checkUser(email);
	  System.out.println(cUsertemp.getEmail());
	  if(email.equals(cUsertemp.getEmail()))
			{
			System.out.println(password); 
		        cUsertemp.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));
		        loginDao.save(cUsertemp);
		        System.out.println(cUsertemp.getPassword());
	          return "updated";	        
			}
		   else
		  {
			  System.out.println("password not updated");
			  return null;
		  }
	}

	@Override
	public Login checkEmail(String email) {
		Login cUser = loginDao.checkEmail(email);
		return cUser;
	}		  	
      
     
	
	
	

}
