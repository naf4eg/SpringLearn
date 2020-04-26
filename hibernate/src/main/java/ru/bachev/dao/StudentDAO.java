package ru.bachev.dao;

import org.hibernate.Session;
import ru.bachev.model.Student;
import ru.bachev.utils.SessionFactoryUtil;

import java.util.List;

public class StudentDAO {

    public StudentDAO() {
    }

    public void create(Student student) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    public Student readId(int studentId) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student readStudent = session.get(Student.class, studentId);
        session.getTransaction().commit();
        session.close();
        return readStudent;
    }

    public List<Student> readAllStudents(){
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Student> listStudents = session.createQuery("from Student").list();
        session.getTransaction().commit();
        session.close();
        return listStudents;
    }
}
