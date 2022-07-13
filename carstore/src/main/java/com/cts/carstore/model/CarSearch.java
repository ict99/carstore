package com.cts.carstore.model;



public class CarSearch {
	// Use validation annotations as per the requirement
	
	private String customerName;
	private String gender;
	private String mobileNumber;
	private String customerCity;
	private String brand;
	private String budgetUpto;
	private String fuelType;
	
	
	public CarSearch() {
		// TODO Auto-generated constructor stub
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {	 	  	 	      	      	 	      	   	 	
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBudgetUpto() {
		return budgetUpto;
	}

	public void setBudgetUpto(String budgetUpto) {
		this.budgetUpto = budgetUpto;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {	 	  	 	      	      	 	      	   	 	
		this.fuelType = fuelType;
	}
	
}
