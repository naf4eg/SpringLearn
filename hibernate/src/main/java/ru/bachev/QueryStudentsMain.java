package ru.bachev;

import ru.bachev.model.Student;
import ru.bachev.service.StudentService;

import java.util.List;

public class QueryStudentsMain {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        List<Student> students = studentService.queryStudents();

        for (Student student : students) {
            System.out.println(student);
        }

    }
}
