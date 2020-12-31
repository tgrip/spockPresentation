package org.example;

public class PersonController {

    private final PersonService personService;
    private final PersonDao personDao;

    public PersonController(PersonService personService, PersonDao personDao) {
        this.personService = personService;
        this.personDao = personDao;
    }

    public void updatePerson(Person person) {
        if (personService.validate(person)) {
            personDao.update(person);
        }
    }
}
