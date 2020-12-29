package org.example

import spock.lang.Specification

class FixtureTest extends Specification {

    def setupSpec() {
        println("###in setup spec!")
    }

    def cleanupSpec() {
        println("###in cleanup spec!")
    }

    def setup() {
        println(">>>in test setup!")
    }

    def cleanup() {
        println(">>>in test cleanup!")
    }

    def "GStrings in tha house"() {
        given:
        def name = "Elvis"

        when:
        def result = "Hello, ${name}"

        then:
        result == "Hello, Elvis"
    }
}
