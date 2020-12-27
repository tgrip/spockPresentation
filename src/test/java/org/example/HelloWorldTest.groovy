package org.example

import spock.lang.Specification

class HelloWorldTest extends Specification {

    def "Test greet"() {
        given:
        def hello = new HelloWorld()

        when:
        def result = hello.greet()

        then:
        result == "Hallo welt"
    }
}
