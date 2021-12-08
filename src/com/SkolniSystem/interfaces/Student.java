package com.SkolniSystem.interfaces;

import com.SkolniSystem.enums.Subjects;

public interface Student {


    String getName();
    int[] getGrades();
    int getSingleGrade(Subjects s);
    void printGrades();
    void printSingleGrade(Subjects s);
    void printSummarry();



}
