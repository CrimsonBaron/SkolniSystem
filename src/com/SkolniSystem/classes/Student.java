package com.SkolniSystem.classes;

import java.util.*;

public class Student implements com.SkolniSystem.interfaces.Student {

    private String name;
    private Map<String, String[]> grades;

    public Student(String name, String[] subjects, String[][] grades) {
        this.name = name;
        this.grades = new HashMap<>();

        for (int i = 0; i < subjects.length ; i++) {
           this.grades.put(subjects[i].toLowerCase(),grades[i]);
        }

    }

    @Override
    public Map<String, String[]> getGrades() {
        return grades;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void printSummary() {
        System.out.println(this.name +" : ");
        for (String key: grades.keySet()) {
            System.out.print("Subject: "+key+" grades: ");
            for (String i :grades.get(key)) {
                System.out.print(i+", ");
            }
            System.out.print("\n");
        }
    }
}
