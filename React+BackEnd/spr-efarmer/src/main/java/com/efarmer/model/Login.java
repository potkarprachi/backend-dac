package com.efarmer.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="login")
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
	@Column(name="district")
	int district;
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
	@ManyToOne
	@JoinColumn(name="districtId")
	private District districts;
	/*
	 {
    "fullame":"Akshay",
    "phone":"8108266719",
    "adhar":"123456789123",
    "district":"Satara",
    "city":"Shirwal",
    "password":"Akshay@16",
    "role":"farmer",
    "email":"akshayatwwe@gmail.com",
    "pincode":400705
}
	 */
	
	
	@Override
	public String toString() {
		return "Login [ID=" + ID + ", fullname=" + fullname + ", phone=" + phone + ", adhar=" + adhar + ", district="
				+ district + ", city=" + city + ", password=" + password + ", role=" + role + ", email=" + email
				+ ", pincode=" + pincode + ", districts=" + districts + "]";
	
	public int getID() {
		return ID;
	}




	public District getDistricts() {
		return districts;

	public void setID(int iD) {
		ID = iD;
	}




	public void setDistricts(District districts) {
		this.districts = districts;
	}





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




//	public String getDistrict() {
//		return district;
//	}
//
//
//
//
//	public void setDistrict(String district) {
//		this.district = district;
//	}


	public int getDistrict() {
	public String getDistrict() {
		return district;
	}




	public void setDistrict(int district) {
		this.district = district;
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



	@Override
	public String toString() {
		return "Login [ID=" + ID + ", fullname=" + fullname + ", phone=" + phone + ", adhar=" + adhar + ", district="
				+ district + ", city=" + city + ", password=" + password + ", role=" + role + ", email=" + email
				+ ", pincode=" + pincode + "]";
	}
	
}

