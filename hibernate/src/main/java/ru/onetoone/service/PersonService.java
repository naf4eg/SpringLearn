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


    public PersonDetail readPerson(int personId) {
        return personDAO.readId(personId);
    }

//    public void updateStudent(int studentId, String firstName) {
//        studentDAO.updateStudentFirstName(studentId, firstName);
//    }
//
//    public void deleteStudent(int studentId) {
//        studentDAO.delete(studentId);
//    }
//
//    public void updateEmailForAllStudents(String email) {
//        studentDAO.updateEmailForAllStudents(email);
//    }
//
//    public List<Student> queryAllStudents(){
//        return studentDAO.readAllStudents();
//    }
//
//    public List<Student> queryStudentsWithLastName(String lastName){
//        return studentDAO.readStudentWithLastName(lastName);
//    }
}
