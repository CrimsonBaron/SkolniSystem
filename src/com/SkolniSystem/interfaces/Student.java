package com.SkolniSystem.interfaces;



import java.util.List;
import java.util.Map;

public interface Student {

    Map<String, String[]> getGrades();
    String getName();

    void printSummary();


}
