package ru.onetoone.service;

import ru.onetoone.dao.PersonDAO;
import ru.onetoone.model.Person;
import ru.onetoone.model.PersonDetail;

public class PersonService {
    PersonDAO personDAO = new PersonDAO();

    public void createPerson(Person person, PersonDetail personDetail) {
        personDAO.create(person, personDetail);
    }

    public void deletePerson(int id) {
        personDAO.delete(id);
    }


    public PersonDetail readPersonBi(int personId) {
        return personDAO.readId(personId);
    }

    public void deletePersonBi(int personId) {
        personDAO.deleteIdBi(personId);
    }
}
