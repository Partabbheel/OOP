package com.Interface.University;

public class DowUniversity implements University{
    @Override
    public void teach(){
        System.out.println("Teaching Students at Dow University ");
    }
    @Override
    public void admitStudents(){
        System.out.println("Admitting  Students to Dow University");
    }


}
