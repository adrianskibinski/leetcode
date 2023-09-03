package org.example

import spock.lang.Specification

class TopKFrequentElementsSpec extends Specification {

    def "should return the k most frequent elements"() {
        given:
            def task = new TopKFrequentElements()
        when:
            def result = task.topKFrequent(nums as int[], k)
        then:
            result == expectedResult as int[]
        where:
            nums               | k || expectedResult
            [1, 1, 1, 2, 2, 3] | 2 || [1, 2]
            [1]                | 1 || [1]
    }
}
