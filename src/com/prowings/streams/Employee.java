package com.prowings.streams;

public class Employee {
	
	String name;
	int age;
	String city;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	

}
