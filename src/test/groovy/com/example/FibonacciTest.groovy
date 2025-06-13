package com.example

import spock.lang.Specification

class FibonacciTest extends Specification {
    def "test Fibonacci with valid inputs"() {
        expect:
        Fibonacci.calculate(n) == expected

        where:
        n   | expected
        0   | 0
        1   | 1
        2   | 1
        3   | 2
        4   | 3
        5   | 5
        6   | 8
        7   | 13
        8   | 21
        9   | 34
    }

    def "should throw exception for negative input"() {
        when:
        Fibonacci.calculate(n)

        then:
        thrown(IllegalArgumentException)

        where:
        n << [-1, -2, -10, -50]
    }
}
