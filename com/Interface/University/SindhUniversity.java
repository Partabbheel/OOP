package com.Interface.University;

public class SindhUniversity implements University{
    @Override
    public void teach(){
        System.out.println("Teaching Students at  University of Sindh");
    }
    @Override
    public void admitStudents(){
        System.out.println("Admitting Students to University of Sindh");
    }
}
