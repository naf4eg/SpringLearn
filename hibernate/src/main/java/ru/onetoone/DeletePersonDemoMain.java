package ru.onetoone;

import ru.onetoone.service.PersonService;

public class DeletePersonDemoMain {

    private static final int ID = 1;

    public static void main(String[] args) {
        PersonService personService = new PersonService();
        personService.deletePerson(ID);
    }
}
