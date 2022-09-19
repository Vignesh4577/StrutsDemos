package com.training.model;

import java.util.Arrays;

public class Student {

	private String name;
	private String password;
	private int age;
	private String gender;
	private String[] hobbies;
	private String course;
	private long mobile;
	private double allowance;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", password=" + password + ", age=" + age + ", gender=" + gender + ", hobbies="
				+ Arrays.toString(hobbies) + ", course=" + course + ", mobile=" + mobile + ", allowance=" + allowance
				+ ", email=" + email + "]";
	}
	
	
	
	
	
}
