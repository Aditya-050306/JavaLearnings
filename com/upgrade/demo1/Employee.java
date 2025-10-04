package com.upgrade.demo1;
//Class Creation
public class Employee {
    int empID;
    String empName;
    int empSalary;
    //Constructor creation
    public Employee(int empID,String empName, int empSalary){
        this.empID=empID;
        this.empName=empName;
        this.empSalary=empSalary;
    }

    public void printData(){
        System.out.println("**************");
        System.out.println("Employee ID: "+empID);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+empSalary);
    }

}
