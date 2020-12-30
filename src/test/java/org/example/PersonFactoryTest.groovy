package org.example

import spock.lang.Specification

class PersonFactoryTest extends Specification {

    def "Testing create developer"() {
        when:
        def programmer = PersonFactory.createDeveloper()

        then: "Checking properties of developer"
        with(programmer) {
            it.age == 28
            !it.name
            it.job == 'Developer'
        }
    }
}
