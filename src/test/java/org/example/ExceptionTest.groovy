package org.example

import spock.lang.Specification

class ExceptionTest extends Specification {

    def "Should get an index out of bounds when removing a non-existent item"() {
        given:
        def list =[1, 2, 3, 4]
        when:
        list.remove(20)

        then:
        thrown(IndexOutOfBoundsException)
        list.size() == 4
    }
}
