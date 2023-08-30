package org.example

import spock.lang.Specification

class AnagramSpec extends Specification {

    def "should check if strings are anagrams"() {
        given:
            var task = new Anagram()
        when:
            def result = task.isAnagram(word1, word2)
        then:
            result == isAnagram
        where:
            word1  | word2  || isAnagram
            "a"    | "a"    || true
            "asd"  | "asd"  || true
            "a"    | "b"    || false
            "abba" | "abbb" || false
    }
}
