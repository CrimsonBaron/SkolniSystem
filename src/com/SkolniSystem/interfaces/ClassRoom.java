package com.SkolniSystem.interfaces;


import java.util.ArrayList;
import java.util.List;

public interface ClassRoom {

    List<Student> getStudents();
    double getSumOfSubject(String subject);
    void printSumOfClass();
    void printSumOfSubject(String subject);


}
