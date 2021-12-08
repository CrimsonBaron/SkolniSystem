package com.SkolniSystem.application;

import com.SkolniSystem.classes.ClassRoom;
import com.SkolniSystem.classes.Student;

import java.util.ArrayList;
import java.util.List;

public class App {
    List <ClassRoom> classRooms = new ArrayList<>();

    public App() {
    }

    public void Run(String[] args){
        classRooms.add(new ClassRoom());
        classRooms.get(0).addStudent(new Student("MAT",1,2,3,4,5));
        classRooms.get(0).addStudent(new Student("CHEM",1,3,4,4,5));
        classRooms.get(0).addStudent(new Student("CZ",1,1,1,2,5));

        classRooms.get(0).listStudents();
        classRooms.get(0).printSumClassRoom();
        classRooms.get(0).printSubjectGrade("MAT");
        classRooms.get(0).getStudentAtIndex(1);


    }

}
