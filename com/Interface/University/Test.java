package com.Interface.University;

public class Test {
    public static void main(String[] args){
        University usindh = new SindhUniversity();
        usindh.teach();
        usindh.admitStudents();

        System.out.println();

        University mehran = new MehranUniversity();
        mehran.teach();
        mehran.admitStudents();

        System.out.println();

        University KU = new KarachiUniversity();
        KU.teach();
        KU.admitStudents();

        System.out.println();

        University dow = new DowUniversity();
        dow.teach();
        dow.admitStudents();
    }

}
