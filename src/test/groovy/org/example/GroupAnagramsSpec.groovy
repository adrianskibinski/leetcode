package org.example

import spock.lang.Specification

class GroupAnagramsSpec extends Specification {

    def "should group anagrams"() {
        given:
            var task = new GroupAnagrams()
        when:
            def result = task.groupAnagrams(words as String[])
        then:
            result == anagramGroup
        where:
            words                                      || anagramGroup
            ['eat', 'tea', 'tan', 'ate', 'nat', 'bat'] || [['eat', 'tea', 'ate'], ['bat'], ['tan', 'nat']]
            ['']                                       || [['']]
            ['a']                                      || [['a']]
    }
}
