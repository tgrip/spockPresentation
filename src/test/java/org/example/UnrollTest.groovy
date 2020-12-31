package org.example

import spock.lang.Specification
import spock.lang.Unroll

class UnrollTest extends Specification {

    @Unroll
    def "#a to the power of #b is #result"() {
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
