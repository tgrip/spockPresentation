package org.example

import spock.lang.Specification

class DataDrivenTest extends Specification {

    def "check some power"() {
        expect:
        Math.pow(a, b) == result

        where:
        a | b   || result
        2 | 2   || 4
        3 | 2   || 9
        2 | 4   || 16
        2 | 10  || 1024
    }
}
