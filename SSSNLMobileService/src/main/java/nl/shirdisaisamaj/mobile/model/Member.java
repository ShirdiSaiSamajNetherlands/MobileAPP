package nl.shirdisaisamaj.mobile.model;

import java.util.Date;

public class Member {
	
	private long id;
	private String name;
	private String address;
	private Date dateOfBirth;
	private int age;
	private String mobileNumber;
	private String landLineNumber;
	private String email;
	private int seva1;
	private int seva2;
	private int seva3;
	private int seva4;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getLandLineNumber() {
		return landLineNumber;
	}
	public void setLandLineNumber(String landLineNumber) {
		this.landLineNumber = landLineNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSeva1() {
		return seva1;
	}
	public void setSeva1(int seva1) {
		this.seva1 = seva1;
	}
	public int getSeva2() {
		return seva2;
	}
	public void setSeva2(int seva2) {
		this.seva2 = seva2;
	}
	public int getSeva3() {
		return seva3;
	}
	public void setSeva3(int seva3) {
		this.seva3 = seva3;
	}
	public int getSeva4() {
		return seva4;
	}
	public void setSeva4(int seva4) {
		this.seva4 = seva4;
	}
}