package ru.bachev.service;

import ru.bachev.dao.StudentDAO;
import ru.bachev.model.Student;

public class StudentService {
    StudentDAO studentDAO = new StudentDAO();

    public void createStudent(Student student){
        studentDAO.create(student);
    }
}
