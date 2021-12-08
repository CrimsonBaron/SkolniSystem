package com.SkolniSystem.classes;


import com.SkolniSystem.interfaces.Student;

import java.util.*;

public class ClassRoom implements com.SkolniSystem.interfaces.ClassRoom {


    List<Student> students;

    public ClassRoom(Student... students) {
        this.students = Arrays.stream(students).toList();
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public double getSumOfSubject(String subject) {
        Map<String, String[]> grades = new HashMap<>();
        double grade = 0;
        List<Integer> tempGrades = new ArrayList<>();
        for (Student student : students) {
            grades = student.getGrades();

            if (grades.containsKey(subject.toLowerCase())) {
                for (String i : grades.get(subject.toLowerCase())) {
                    if (!i.equals("N")) {
                        tempGrades.add(Integer.parseInt(i));
                    }
                }
            } else {
                System.out.println("subject does not exist");
                return -1;
            }

        }

        for (int i : tempGrades) {
            grade += i;
        }

        grade /= tempGrades.size();
        return grade;
    }

    @Override
    public void printSumOfClass() {
        double grade = 0;
        List<Double> tempGrades = new ArrayList<>();


        for (String key : students.get(0).getGrades().keySet()) {
            System.out.print(key + " : grade: ");
            for (String i : students.get(0).getGrades().get(key)) {
                if (!i.equals("N")) {
                    System.out.print(getSumOfSubject(key));
                    tempGrades.add(getSumOfSubject(key));
                }
            }
            System.out.print("\n");
        }


        for (double d : tempGrades) {
            grade += d;
        }

        grade /= tempGrades.size();
        System.out.println("sum of every subject and class: " + grade);
    }

    @Override
    public void printSumOfSubject(String subject) {
        System.out.println("Subject: " + subject + " sum grade: " + getSumOfSubject(subject));

    }
}
