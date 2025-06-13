package com.example

import spock.lang.Specification

class MathUtilityTest extends Specification {
    def "test isPrime with valid inputs"() {
        expect:
        MathUtility.isPrime(n) == expected

        where:
        n   | expected
        0   | false
        1   | false
        2   | true
        3   | true
        4   | false
        5   | true
        10  | false
        17  | true
        19  | true
    }
}
