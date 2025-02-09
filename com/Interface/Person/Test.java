package com.Interface.Person;

public class Test {
    public static void main(String[] args){
        Person student = new Student();
        student.displayDetails();
        student.performAction();
        System.out.println();

        Person teacher = new Teacher();
        teacher.displayDetails();
        teacher.performAction();

        System.out.println();

        Person employee = new Employee();
        employee.displayDetails();
        employee.performAction();

        System.out.println();
    }
}
