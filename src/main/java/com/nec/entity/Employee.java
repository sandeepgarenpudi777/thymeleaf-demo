package com.nec.entity;

public class Employee {
	
	private Long id;
	private String name;
	private String desg;
	private float salary;
	
	public Employee(Long id, String name, String desg, float salary) {
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.salary = salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}


}
