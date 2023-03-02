package com.efarmer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;

@Entity
public class CropStatus
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cropID;
	@Column(name="farmerId")
	int farmerId;
//	@Column(name="cropId")
//	int cropId;
	@Column(name="cropName",length=20)
	String cropName;
	@Column(name="cropCategory")
	int cropCategoryID;
	@Column(name="weight")
	float weight;
	@Column(name="status",length=10)
	String status;
	@Column(name="price")
	float price;
	@Column(name="customerId ")
	int customerid;
	
	
	/*
	{
	    "farmerId":1,
	    "cropName":"Rice",
	    "cropCategoryID":25,
	    "weight":1000,
	    "customerid":20,
	    "price"300
	}
	*/
	
	

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public int getCropCategoryID() {
		return cropCategoryID;
	}
	public void setCropCategoryID(int cropCategoryID) {
		this.cropCategoryID = cropCategoryID;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
}
