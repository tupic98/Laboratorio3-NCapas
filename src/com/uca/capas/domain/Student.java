package com.uca.capas.domain;

public class Student {
	private String name;
	private String lastName;
	private String bDate;
	private String carreer;
	private String experience;
	
	public Student() {
		
	}
	
	public Student(String name, String lastName, String bDate, String carreer, String experience){
		this.name = name;
		this.lastName = lastName;
		this.bDate = bDate;
		this.carreer = carreer;
		this.experience = experience;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	public String getCarreer() {
		return carreer;
	}
	public void setCarreer(String carreer) {
		this.carreer = carreer;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	
}
