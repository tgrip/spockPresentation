package org.example

import spock.lang.Specification

class AdderTest extends Specification {

    def "Add test"() {
        given:
        def adder = new Adder()

        when:
        def result = adder.add(3, 4)

        then:
        result == 7
    }
}
