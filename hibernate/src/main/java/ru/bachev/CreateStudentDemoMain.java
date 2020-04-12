package ru.bachev;

import ru.bachev.model.Student;
import ru.bachev.service.StudentService;

public class CreateStudentDemoMain {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.createStudent(new Student("Andrey", "Omelchuk", "omelchuk@yaya.ru"));
    }
}
