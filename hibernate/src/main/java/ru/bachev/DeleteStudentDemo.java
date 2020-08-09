package ru.bachev;

import ru.bachev.service.StudentService;

public class DeleteStudentDemo {
    public static void main(String[] args) {

        int studentId = 9;
        String firstName = "Alexey";

        StudentService studentService = new StudentService();

        studentService.deleteStudent(studentId);
    }
}
