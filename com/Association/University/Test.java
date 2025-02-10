package com.Association.University;

public class Test {
    public static void main(String[] args){
        Department  department = new Department();
        department.setName("IMCS");
        University university =new University();
        university.setName("University of Sindh");

        System.out.println("University Name:"+university.getName());
        System.out.println("Department Name:"+department.getName());
    }
}
