package org.example

import spock.lang.Specification

class AnagramSpec extends Specification {

    def "should check if strings are anagrams - version 1"() {
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
            "abb"  | "abbb" || false
    }

    def "should check if strings are anagrams - version 2"() {
        given:
            var task = new Anagram()
        when:
            def result = task.isAnagram2(word1, word2)
        then:
            result == isAnagram
        where:
            word1  | word2  || isAnagram
            "a"    | "a"    || true
            "asd"  | "asd"  || true
            "a"    | "b"    || false
            "abba" | "abbb" || false
            "abb"  | "abbb" || false
    }
}
