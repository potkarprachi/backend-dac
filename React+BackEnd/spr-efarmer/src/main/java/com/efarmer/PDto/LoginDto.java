package com.efarmer.PDto;


public class LoginDto 
{



	int ID;
	String fullname;
	String phone;
	String adhar;
	String city;
	String password;
	String role;
	String email;
	String pincode;
	private DistrictDto districts;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
	public DistrictDto getDistricts() {
		return districts;
	}
	public void setDistricts(DistrictDto districts) {
		this.districts = districts;
	}
	@Override
	public String toString() {
		return "Login [ID=" + ID + ", fullname=" + fullname + ", phone=" + phone + ", adhar=" + adhar + ", city=" + city
				+ ", password=" + password + ", role=" + role + ", email=" + email + ", pincode=" + pincode
				+ ", districts=" + districts + "]";
	}

	
	
}

