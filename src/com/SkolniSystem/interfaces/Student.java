package com.SkolniSystem.interfaces;

import com.SkolniSystem.enums.Subjects;

import java.util.List;
import java.util.Map;

public interface Student {


    String getName();
    Map<String, List<Integer>> getGrades();
    int getSingleGrade(String s);
    int getGradeSummary();
    void printGrades();
    void printSingleGrade(String s);
    void printSummarry();



}
