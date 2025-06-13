package com.example

import spock.lang.Specification

class FactorialTest extends Specification {
    def "should calculate factorial correctly"() {
        expect:
        Factorial.calculate(input) == expected

        where:
        input | expected
        0     | 1
        1     | 1
        2     | 2
        3     | 6
        5     | 120
    }
}
