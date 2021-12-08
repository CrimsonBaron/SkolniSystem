package com.SkolniSystem.classes;

import com.SkolniSystem.enums.Subjects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements com.SkolniSystem.interfaces.Student {

    private String name;
    private Map<String, List<Integer>> grades;

    public Student(String name, String[] grades) {
        this.name = name;
        this.grades = new HashMap<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Map<String, List<Integer>> getGrades() {
        return grades;
    }

    @Override
    public int getSingleGrade(String s) {
        for (String sub: grades.keySet()) {
            if (sub.equals(s)){
                return grades.get(sub);
            }
        }
    }

    @Override
    public int getGradeSummary() {
        int grade = 0;
        for (String i :grades) {
            if (!i.equals("N")){
                grade += Integer.parseInt(i);
            }
        }

        grade /= grades.length;

        return grade;
    }

    @Override
    public void printGrades() {

        for (String i :grades) {
            if (!i.equals("N")){
                System.out.println(Subjects);
            }
        }
    }

    @Override
    public void printSingleGrade(String s) {

    }

    @Override
    public void printSummarry() {

    }
}
