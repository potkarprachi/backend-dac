package com.efarmer.PDto;


import java.util.Calendar;


public class TransactionDto 
{
	int transactionId;
	float price;
	Calendar date;
	String status;
	int farmerId;
	int customerid;
	int cropID;
	float weight;
	

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	public int getCropID() {
		return cropID;
	}
	public void setCropID(int cropID) {
		this.cropID = cropID;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}


	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getTransactionId() {
		return transactionId;
	}
}
