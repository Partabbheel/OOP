package com.Interface.University;

public class MehranUniversity implements University{
    @Override
    public void teach(){
        System.out.println("Teaching Students at Mehran University of Engineering and Technology Jamshoro");
    }
    @Override
    public void admitStudents(){
        System.out.println("Admitting Students to Mehran University of Engineering and Technology Jamshoro ");
    }


}
