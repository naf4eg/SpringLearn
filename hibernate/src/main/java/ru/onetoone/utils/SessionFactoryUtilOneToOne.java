package ru.onetoone.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bachev.model.Student;
import ru.onetoone.model.Person;
import ru.onetoone.model.PersonDetail;


public class SessionFactoryUtilOneToOne {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Person.class)
                        .addAnnotatedClass(PersonDetail.class)
                        .buildSessionFactory();
            } catch (Exception exp) {
                System.out.println("Exeption session!!! " + exp);
            }
        }

        return sessionFactory;
    }

}
