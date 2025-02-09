package com.Interface.University;

public class KarachiUniversity implements University{
    @Override
    public void teach(){
        System.out.println("Teaching Students at Karachi University");
    }
    @Override
    public void admitStudents(){
        System.out.println("Admitting Students to Karachi University");
    }

}
