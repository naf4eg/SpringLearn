package ru.bachev;

import ru.bachev.model.Student;
import ru.bachev.service.StudentService;

public class ReadStudentDemoMain {
    public static void main(String[] args) {

        int studentId = 1;

        StudentService studentService = new StudentService();

        Student student = studentService.readStudent(studentId);

        if (student== null){
            System.out.println("Not student in DB");
        } else {
            System.out.println(student);
        }
    }
}
