package org.example

import spock.lang.Specification

class ValidSudokuSpec extends Specification {
    def "should check if sudoku board is valid"() {
        when:
            def result = ValidSudoku.isValidSudoku(board as char[][])
        then:
            result == expectedResult
        where:
            board                                           || expectedResult
            [["5", "3", ".", ".", "7", ".", ".", ".", "."]
            ,["6", ".", ".", "1", "9", "5", ".", ".", "."]
            ,[".", "9", "8", ".", ".", ".", ".", "6", "."]
            ,["8", ".", ".", ".", "6", ".", ".", ".", "3"]
            ,["4", ".", ".", "8", ".", "3", ".", ".", "1"]
            ,["7", ".", ".", ".", "2", ".", ".", ".", "6"]
            ,[".", "6", ".", ".", ".", ".", "2", "8", "."]
            ,[".", ".", ".", "4", "1", "9", ".", ".", "5"]
            ,[".", ".", ".", ".", "8", ".", ".", "7", "9"]] || true
            [["8", "3", ".", ".", "7", ".", ".", ".", "."]
            ,["6", ".", ".", "1", "9", "5", ".", ".", "."]
            ,[".", "9", "8", ".", ".", ".", ".", "6", "."]
            ,["8", ".", ".", ".", "6", ".", ".", ".", "3"]
            ,["4", ".", ".", "8", ".", "3", ".", ".", "1"]
            ,["7", ".", ".", ".", "2", ".", ".", ".", "6"]
            ,[".", "6", ".", ".", ".", ".", "2", "8", "."]
            ,[".", ".", ".", "4", "1", "9", ".", ".", "5"]
            ,[".", ".", ".", ".", "8", ".", ".", "7", "9"]] || false
    }
}
