package ru.onetoone;

import ru.bachev.model.Student;
import ru.bachev.service.StudentService;

public class CreateStudentDemoMain {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.createStudent(new Student("Delete", "Deletovich", "BurkovBurkov@yaya.ru"));
    }
}
