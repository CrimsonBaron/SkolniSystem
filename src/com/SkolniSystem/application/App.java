package com.SkolniSystem.application;

import com.SkolniSystem.classes.ClassRoom;
import com.SkolniSystem.classes.ClassRoomManager;
import com.SkolniSystem.classes.Student;

import java.util.ArrayList;
import java.util.List;

public class App {

    ClassRoomManager classRoomManager = new ClassRoomManager();

    public App() {
    }

    public void Run(String[] args){

        /*
        * 1) vypyse vsechny zaky a prumeru zaku
        * 2) vypise prumer jednoho zaka z predmetu
        * 3) vypise vysvedceni zaka
        * */


        classRoomManager.getClasses().put("1ai", new ClassRoom(
                new Student("novak",
                        new String[]{"Math","language"},
                        new String[][]{{"1","2","5"},{"1","1","2"}}),
                new Student("novak2",
                        new String[]{"Math","language"},
                        new String[][]{{"2","2","3"},{"5","1","2"}}),
                new Student("novak3",
                        new String[]{"Math","language"},
                        new String[][]{{"2","2","3"},{"5","1","2","5","5"}}))
        );

        classRoomManager.getClasses().put("2ai", new ClassRoom(
                new Student("bb",
                        new String[]{"Math","language"},
                        new String[][]{{"3","3","5"},{"1","4","2"}}),
                new Student("bb2",
                        new String[]{"Math","language"},
                        new String[][]{{"2","5","3"},{"5","5","5","5"}}))
        );

        System.out.println("--------------------------1ai----------------------------------");
        classRoomManager.getClasses().get("1ai").printSumOfSubject("math");
        classRoomManager.getClasses().get("1ai").printSumOfSubject("language");
        classRoomManager.getClasses().get("1ai").getStudents().get(1).printSummary();
        classRoomManager.getClasses().get("1ai").getStudents().get(0).printSummary();
        System.out.println("sum of class -> ");
        classRoomManager.getClasses().get("1ai").printSumOfClass();
        System.out.println("--------------------------2ai----------------------------------");
        classRoomManager.getClasses().get("2ai").printSumOfSubject("math");
        classRoomManager.getClasses().get("2ai").printSumOfSubject("language");
        classRoomManager.getClasses().get("2ai").getStudents().get(1).printSummary();
        classRoomManager.getClasses().get("2ai").getStudents().get(0).printSummary();
        System.out.println("sum of class -> ");
        classRoomManager.getClasses().get("2ai").printSumOfClass();
    }

}
