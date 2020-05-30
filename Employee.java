package test.java;

import java.util.Date;

public class Employee {
	private String name;
	private String email;
	private Date dateOfBirth;
	private double salary;
	private int age;

	String description = "This is the changed line in branch emp-changes";
	
	public Employee(String name, String email, Date dateOfBirth, int age, double salary) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
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

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
