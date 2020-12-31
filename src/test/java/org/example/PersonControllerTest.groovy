package org.example

import spock.lang.Specification

class PersonControllerTest extends Specification {

    def "test update person"() {
        given: "person"
        Person person = new Person()

        and: "mocks and services"
        PersonService personService = Mock()
        personService.validate(person) >> true

        PersonDao personDao = Mock()
        PersonController controller = new PersonController(personService, personDao)

        when:
        controller.updatePerson(person)

        then:
        1 * personService.validate(person)
        personDao.update(person)
    }
}
