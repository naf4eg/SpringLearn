package ru.bachev.service;

import ru.bachev.dao.StudentDAO;
import ru.bachev.model.Student;

import java.util.List;

public class StudentService {
    StudentDAO studentDAO = new StudentDAO();

    public void createStudent(Student student) {
        studentDAO.create(student);
    }

    public Student readStudent(int studentId) {
        return studentDAO.readId(studentId);
    }

    public List<Student> queryStudents(){
        return studentDAO.readAllStudents();
    }
}
