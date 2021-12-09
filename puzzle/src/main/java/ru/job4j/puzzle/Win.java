package ru.job4j.puzzle;

public class Win {
    public static boolean monoVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != board[0][column]) {
               rsl = false;
               break;
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int board[][], int row){
        boolean rsl = true;
        for (int column = 0; column < board.length; column++) {
            if(board[row][column] != board[row][0]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == (monoHorizontal(board, i) || monoVertical(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
