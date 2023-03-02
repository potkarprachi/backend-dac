package com.efarmer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	int ID;
	@Column(name="fullname",length=50)
	String fullname;
	@Column(name="phone",length=10)
	String phone;
	@Column(name="adhar",length=12)
	String adhar;
	@Column(name="district",length=20)
	String district;
	@Column(name="city",length=20)
	String city;
	@Column(name="password",length=16)
	String password;
	@Column(name="role",length=10)
	String role;
	@Column(name="email")
	String email;
	@Column(name="pincode")
	String pincode;
	
	
	
	
	public String getFullname() {
		return fullname;
	}




	public void setFullname(String fullname) {
		this.fullname = fullname;
	}




	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




	public String getAdhar() {
		return adhar;
	}




	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}




	public String getDistrict() {
		return district;
	}




	public void setDistrict(String district) {
		this.district = district;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPincode() {
		return pincode;
	}




	public void setPincode(String pincode) {
		this.pincode = pincode;
	}




	public int getID() {
		return ID;
	}
	
	
}


/*
 	{
    "farmerName":"Akshay",
    "farmerMobNo":"8108266719",
    "farmerAadharNo":"123456789123",
    "farmerDistrict":"Satara",
    "farmerCity":"Shirwal",
    "farmerPassword":"Akshay@16",
    "farmerRole":"farmer"
	}
 */