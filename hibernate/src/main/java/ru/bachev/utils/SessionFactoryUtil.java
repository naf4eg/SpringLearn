package ru.bachev.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bachev.model.Student;


public class SessionFactoryUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Student.class)
                        .buildSessionFactory();
            } catch (Exception exp) {
                System.out.println("Exeption session!!! " + exp);
            }
        }

        return sessionFactory;
    }

}
