package ru.bachev.dao;

import org.hibernate.Session;
import ru.bachev.model.Student;
import ru.bachev.utils.SessionFactoryUtil;

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
}
