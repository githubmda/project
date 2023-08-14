package com.example.bootdemo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transaction 
{
	private String userName;
	private String email;
	@Id
	private int busId;
	private String busName;
	private int noOfSeats;
	private double price;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	
}