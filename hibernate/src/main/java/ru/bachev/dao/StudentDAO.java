package ru.bachev.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
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

    public void updateStudentFirstName(int studentId, String firstName) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class, studentId);
        student.setFirstName(firstName);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(int studentId) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class, studentId);
        //session.delete(student);  //firs variant deleting

        //second variant delete
        Query query = session.createQuery("delete from Student where id =: id");
        query.setParameter("id", studentId)
                .executeUpdate();

        session.getTransaction().commit();
        session.close();
    }

    public List readAllStudents(){
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List listStudents = session.createQuery("from Student").list();
        session.getTransaction().commit();
        session.close();
        return listStudents;
    }

    public List readStudentWithLastName(String lastName){
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
       // List listStudents = session.createQuery("from Student std where std.lastName = 'Burkov'").list();
       // List listStudents = session.createQuery("from Student std where std.lastName = 'Burkov' or std.lastName = 'Ponomarev'").list();
        List listStudents = session.createQuery("from Student std where std.email LIKE '%yaya.ru'").list();
        session.getTransaction().commit();
        session.close();
        return listStudents;
    }

    public void updateEmailForAllStudents(String email){
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("update Student set email =: setEmail");
        query.setParameter("setEmail", email)
                .executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}
