package com.example.bootdemo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bus 
{
	@Id
	private int id;
	private String busName;
	private String busDestination;
	private String busType;
	private int totalSeat;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusDestination() {
		return busDestination;
	}
	public void setBusDestination(String busDestination) {
		this.busDestination = busDestination;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getTotalSeat() {
		return totalSeat;
	}
	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}