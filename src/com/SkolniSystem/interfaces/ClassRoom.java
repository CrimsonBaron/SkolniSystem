package com.SkolniSystem.interfaces;

import com.SkolniSystem.enums.Subjects;

import java.util.ArrayList;

public interface ClassRoom {

    ArrayList<Student> getStudents();
    void addStudent(Student s);
    Student getLastStudents();
    Student getStudentAtIndex(int i);
    void listStudents();

    void printSubjectGrade(Subjects s);
    void printSumClassRoom();


}
