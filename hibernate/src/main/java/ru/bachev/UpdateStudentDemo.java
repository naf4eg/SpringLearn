package ru.bachev;

import ru.bachev.model.Student;
import ru.bachev.service.StudentService;

public class UpdateStudentDemo {
    public static void main(String[] args) {

        int studentId = 1;
        String firstName = "Alexey";

        StudentService studentService = new StudentService();

       // studentService.updateStudent(studentId, firstName);
        studentService.updateEmailForAllStudents("ogogo@mail.ru");
    }
}
