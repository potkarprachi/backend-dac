package com.efarmer.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.efarmer.model.Login;
import com.efarmer.service.LoginService;



@RestController
@CrossOrigin(value= {"http://localhost:3000"})
public class LoginController 
{
	@Autowired
	private LoginService loginService;
	
	@PostMapping(value= {"/userAdd"})
	public String userAdd(@RequestBody Login user)
	{
		loginService.insert(user);
		return "success";
	}
	
//	@GetMapping(value= {"/userAddGet"})
//	public String userAddGet(Login user)
//	{
//		loginService.insert(user);
//		return "success";
//	}
	
	@PostMapping(value= {"/userLogin"})
	public Login userLogin(@RequestBody Login user)
	{
		
		return loginService.check(user);
	}
	@GetMapping(value= {"/getAccDetails/{id}"})
	public Login getAccDetailsId(@PathVariable int id)
	{
		return loginService.getDetails(id);
	}
}


//prachi
//akshay1