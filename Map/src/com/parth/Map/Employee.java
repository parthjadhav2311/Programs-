package com.parth.Map;

import java.util.HashMap;

public class Employee {
	
	 private int id;
	    private String name;
	    private double salary;
	    private String department;

	  
	    public Employee(int id, String name, double salary, String department) {
	        this.id = id;
	        
	        this.name = name;
	        
	        this.salary = salary;
	        
	        this.department = department;
	    }

	  
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public static void main(String[] args) {
	        
	        HashMap<Integer, Employee> employeeMap = new HashMap<>();

	    
	        Employee emp1 = new Employee(1, "Parth Jadhav", 30000, "IT");
	        Employee emp2 = new Employee(2, "Rahul Jadhav", 20000, "HR");
	        Employee emp3 =  new Employee(3,"Varad Jadhav", 10000, "IT");

	        employeeMap.put(emp1.getId(), emp1);
	        employeeMap.put(emp2.getId(), emp2);

	        
	        Employee retrievedEmployee = employeeMap.get(1);
	        System.out.println("Employee Details:");
	        
	        System.out.println("ID: " + retrievedEmployee.getId());
	        
	        System.out.println("Name: " + retrievedEmployee.getName());
	        
	        System.out.println("Salary: " + retrievedEmployee.getSalary());
	        
	        System.out.println("Department: " + retrievedEmployee.getDepartment());
	    }
	}
	 


