package ru.onetoone;

import ru.bachev.model.Student;
import ru.bachev.service.StudentService;
import ru.onetoone.model.Person;
import ru.onetoone.model.PersonDetail;
import ru.onetoone.service.PersonService;

public class CreatePersonDemoMain {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person person = new Person("Denis", "Burkov", "Burkov@email.ru");
        PersonDetail personDetail = new PersonDetail("Burkov@youtube", "Cycling");

        personService.createPerson(
                person,
                personDetail
        );
    }
}
