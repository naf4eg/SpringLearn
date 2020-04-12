package ru.bachev;

import ru.bachev.model.Student;
import ru.bachev.service.StudentService;

public class PrimaryKeyDemo {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.createStudent(new Student("Alexey", "Litovchenko", "litov@yaya.ru"));
        studentService.createStudent(new Student("Konstantin", "Ponomarev", "ponomarev@yaya.ru"));
        studentService.createStudent(new Student("Denis", "Burkov", "burkov@yaya.ru"));
        studentService.createStudent(new Student("Ilya", "Cherniy", "black@yaya.ru"));
    }
}
