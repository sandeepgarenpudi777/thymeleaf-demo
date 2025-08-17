package com.nec.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nec.entity.Employee;

@Service
public class EmpService {
	private  static List<Employee> emps=List.of(
			new Employee(101l,"Rahul","Clerk",25000),
			new Employee(102l,"harsha","Developer",35000),
			new Employee(103l,"Akhilesh","Trainer",30000)
			);

	public List<Employee> getAll(){
		return emps;
	}
}
