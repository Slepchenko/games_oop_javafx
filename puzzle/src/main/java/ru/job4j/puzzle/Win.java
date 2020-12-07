package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[row][cell] == 1) {
                    if (checkRow(board, row) || checkCell(board, cell)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkRow(int[][] board, int rowIndex) {
        for (int row = 0; row < board.length; row++) {
            if (board[rowIndex][row] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCell(int[][] board, int cellIndex) {
        for (int cell = 0; cell < board.length; cell++) {
            if (board[cell][cellIndex] != 1) {
                return false;
            }
        }
        return true;
    }

}
