package com.Association.Employee;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setName(" Abdul Aziz");
        employee.setPosition("Software Engineer");
        Company company = new Company();
        company.setName("ABC ");


        System.out.println("Employee Name:"+employee.getName());
        System.out.println("Position:"+ employee.getPosition());
        System.out.println("Company Name:"+company.getName());

    }

}
