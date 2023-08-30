package org.example

import spock.lang.Specification

class ContainsDuplicateSpec extends Specification {

    void "should check if any value appears at least twice in the array"() {
        given:
            def task = new ContainsDuplicate()
        when:
            def result = task.containsDuplicate(numbers as int[])
        then:
            result == containsDuplicate
        where:
            numbers   || containsDuplicate
            [1, 2, 3] || false
            [1, 2, 1] || true
            []        || false
            [1, 1, 1] || true
    }
}
