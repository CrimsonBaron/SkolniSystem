package com.SkolniSystem.classes;

import com.SkolniSystem.enums.Subjects;
import com.SkolniSystem.interfaces.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom implements com.SkolniSystem.interfaces.ClassRoom {

    private ArrayList<Student> students;
    private int lastIndex;

    public ClassRoom() {
       this.students = new ArrayList<Student>();
       this.lastIndex = 0;
    }

    @Override
    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public void addStudent(Student s) {
        students.add(s);
        lastIndex = students.indexOf(s);
    }

    @Override
    public Student getLastStudents() {
        return students.get(lastIndex);
    }

    @Override
    public Student getStudentAtIndex(int i) {
        return students.get(i);
    }

    @Override
    public void listStudents() {
        if (!students.isEmpty()){
            for (Student s:students) {
                System.out.print(students.indexOf(s)+"> name: "+s.getName()+", ");
            }
            System.out.print("\n");
        }
    }

    @Override
    public void printSubjectGrade(String s) {
        List<Integer> tempGrades = new ArrayList<Integer>();
        int grade = 0;
        if (!students.isEmpty()){
            for (Student stu:students) {
                if(stu.getGrades().containsKey(s)) {
                    for (int i = 0; i < stu.getGrades().get(s).length; i++) {
                        tempGrades.add(stu.getGrades().get(s)[i]);

                    }
                }
            }

            for (int i:tempGrades) {
                grade += i;
            }

            grade /= tempGrades.size();

            System.out.println(s.toString()+" : "+grade);

        }
    }

    @Override
    public void printSumClassRoom() {
        int grade = 0;
        for (Student s: students) {
            grade += s.getGradeSummary();
        }
        grade /= students.size();
        System.out.println("class sum is: "+grade);
    }
}
