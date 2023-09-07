package org.example;

import java.util.HashSet;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {

        var numbers = new HashSet<String>();

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (board[row][column] != '.') {
                    if (!numbers.add("R" + row + "V" + board[row][column])
                            || !numbers.add("C" + column + "V" + board[row][column])
                            || !numbers.add("B" + row / 3 + column / 3 + "V" + board[row][column])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
