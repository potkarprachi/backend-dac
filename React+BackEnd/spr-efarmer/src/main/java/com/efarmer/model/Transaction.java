package com.efarmer.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="transactions")
public class Transaction 
{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int transactionId;
	@Column(name = "amount")
	float price;
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "date")
	Calendar date;
	@Column(name = "status",length = 10)
	String status;
	@Column(name = "farmerId")
	int farmerId;
	@Column(name = "customerId")
	int customerid;
	@Column(name = "crop")
	int cropID;
	@Column(name = "weight")
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
