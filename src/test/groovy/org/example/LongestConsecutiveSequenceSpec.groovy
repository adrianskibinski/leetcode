package org.example

import spock.lang.Specification

class LongestConsecutiveSequenceSpec extends Specification {

    def "should return the length of the longest consecutive elements sequence"() {
        given:
            var task = new LongestConsecutiveSequence()
        when:
            def result = task.longestConsecutive(numbers as int[])
        then:
            result == expectedResult
        where:
            numbers                        || expectedResult
            [100, 4, 200, 1, 3, 2]         || 4
            [0, 3, 7, 2, 5, 8, 4, 6, 0, 1] || 9
    }
}
