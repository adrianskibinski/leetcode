package org.example

import spock.lang.Specification

class ProductOfArrayExceptSelfSpec extends Specification {
    def "should return an array answer such that answer"() {
        when:
            def result = ProductOfArrayExceptSelf.productExceptSelf(nums as int[])
        then:
            result == expectedResult as int[]
        where:
            nums              || expectedResult
            [1, 2, 3, 4]      || [24, 12, 8, 6]
            [-1, 1, 0, -3, 3] || [0, 0, 9, 0, 0]

    }
}
