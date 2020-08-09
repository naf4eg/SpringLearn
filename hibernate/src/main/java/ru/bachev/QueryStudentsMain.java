package ru.bachev;

import ru.bachev.model.Student;
import ru.bachev.service.StudentService;

import java.util.List;

public class QueryStudentsMain {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        List<Student> students = studentService.queryAllStudents();
        displayStudents(students);
        List<Student> studentsWithLastName = studentService.queryStudentsWithLastName("Burkov");
        displayStudents(studentsWithLastName);

    }

    private static void displayStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
