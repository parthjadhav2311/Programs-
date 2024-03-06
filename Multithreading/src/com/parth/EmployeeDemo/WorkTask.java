package com.parth.EmployeeDemo;

class WorkTask extends Thread {
    private Employee employee;

    public WorkTask(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void run() {
        employee.doWork();
    }
}
