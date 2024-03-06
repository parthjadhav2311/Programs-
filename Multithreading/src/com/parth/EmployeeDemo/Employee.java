package com.parth.EmployeeDemo;

class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void doWork() {
        System.out.println(name + " is working. Employee ID: " + employeeId);
    }
}
