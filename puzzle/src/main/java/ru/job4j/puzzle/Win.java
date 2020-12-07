package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        if (checkRow(board, findElement(board)[0]) || checkCell(board, findElement(board)[1])) {
           return true;
        }
        return false;
    }

    public static int[] findElement(int[][] board) {
        int[] res = new int[2];
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[row][cell] == 1) {
                    res[0] = row;
                    res[1] = cell;
                }
            }
        }
        return res;
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
