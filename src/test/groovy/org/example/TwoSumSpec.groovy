package org.example

import spock.lang.Specification

class TwoSumSpec extends Specification {

    def "should check if array contains two numbers that equals to target"() {
        given:
            def task = new TwoSum()
        when:
            def result = task.twoSum(numbers as int[], target)
        then:
            result == expectedResult as int[]
        where:
            numbers        | target || expectedResult
            [3, 2, 4]      | 6      || [1, 2]
            [2, 7, 11, 15] | 9      || [0, 1]
            [3, 3]         | 6      || [0, 1]
    }
}
