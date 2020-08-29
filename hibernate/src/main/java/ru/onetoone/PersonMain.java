package ru.onetoone;

import ru.onetoone.model.Person;
import ru.onetoone.model.PersonDetail;
import ru.onetoone.service.PersonService;

public class PersonMain {

    private static final int ID = 3;

    public static void main(String[] args) {
        PersonMain personMain = new PersonMain();
        personMain.deletePersonBi(ID);
    }

    private void createPerson(){
        PersonService personService = new PersonService();
        Person person = new Person("Denis", "Burkov", "Burkov@email.ru");
        PersonDetail personDetail = new PersonDetail("Burkov@youtube", "Basketball");

        personService.createPerson(
                person,
                personDetail
        );
    }

    private void deletePerson(int ID) {
        PersonService personService = new PersonService();
        personService.deletePerson(ID);
    }

    //Bi-directional mode
    private void readPersonBi(int id) {
        PersonService personService = new PersonService();
        PersonDetail person = personService.readPersonBi(id);
        System.out.println(person.toString());
        System.out.println(person.getPerson());
    }

    private void deletePersonBi(int id) {
        PersonService personService = new PersonService();
        personService.deletePersonBi(id);
    }
}
