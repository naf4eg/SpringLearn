package ru.onetoone;

import ru.onetoone.model.Person;
import ru.onetoone.model.PersonDetail;
import ru.onetoone.service.PersonService;

public class PersonMain {

    private static final int ID = 3;

    public static void main(String[] args) {
        PersonMain personMain = new PersonMain();
        personMain.createPerson();
    }

    private void createPerson(){
        PersonService personService = new PersonService();
        Person person = new Person("Leha", "Litov", "Omelchuk@email.ru");
        PersonDetail personDetail = new PersonDetail("Omelchuk@youtube", "Drink");

        personService.createPerson(
                person,
                personDetail
        );
    }

    private void deletePerson(int ID){
        PersonService personService = new PersonService();
        personService.deletePerson(ID);
    }
}
