package com.upgrade.demo1;

public class UsageEmployee {
    public static void main(String[] args) {
        Employee emp1= new Employee(101, "Aditya Joshi", 234567);
        Employee emp2= new Employee(102, "Siddhant Joshi", 234568);
        emp1.printData();
        emp2.printData();
    }
}
