package com.parth.Immuteableclass;

public class Address {
	
	private int pin;
	private String city;
	private String country;
	
	public Address() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	public Address(int pin,String city,String country) {
		super();
		this.pin = pin;
		this.city = city;
		this.country = country;
	}
	
	public int getPin() {
		return pin;
		
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public String getCity() {
		return city;
		
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
		
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString() {
		return "Address [pin="+ pin +",city=" + city +",country="  + country +"]";
		
	}

}
