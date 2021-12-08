package com.SkolniSystem.classes;

import java.util.*;

public class Student implements com.SkolniSystem.interfaces.Student {

    private String name;
    private Map<String, int[]> grades;

    public Student(String name, int... i) {
        this.name = name;
        this.grades = new HashMap<>();
        grades.put(name, i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Map<String, int[]> getGrades() {
        return grades;
    }

    @Override
    public int getSingleGrade(String s) {
        for (String sub: grades.keySet()) {
            if (sub.equals(s)){
                return grades.get(sub)[0];
            }
        }
        return 0;
    }

    @Override
    public int getGradeSummary() {
        List<Integer> tempList = new ArrayList<>();
        int grade = 0;
        for (String sub: grades.keySet()) {
            for (int i:grades.get(sub)) {
                tempList.add(i);
            }
        }

        for (int i:tempList) {
            grade +=i;
        }



        grade /= tempList.size();

        return grade;
    }

    @Override
    public void printGrades() {


    }

    @Override
    public void printSingleGrade(String s) {

    }

    @Override
    public void printSummarry() {

    }
}
