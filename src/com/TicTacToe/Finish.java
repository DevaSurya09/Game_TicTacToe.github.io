package com.TicTacToe;
public class Finish {
    public boolean isGameFinish1(char[][] board) {
        winOrLose wol = new winOrLose();
        B Board = new B();
        CS clrScr = new CS();
        if (wol.win(board, 'X')) {
            clrScr.clearScreen();
            Board.printboard(board);
            System.out.println("player win\n");
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;

                }
            }
        }
        return true;
    }

    public boolean isGameFinish2(char[][] board) {
        winOrLose wol = new winOrLose();
        B Board = new B();
        CS clrScr = new CS();
        if (wol.win(board, 'O')) {
            clrScr.clearScreen();
            Board.printboard(board);
            System.out.println("bot win\n");
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;

                }
            }
        }
        return true;
    }

    public boolean isGameFinish4(char[][] board) {
        winOrLose wol = new winOrLose();
        B Board = new B();
        CS clrScr = new CS();
        if (wol.drawWin(board)) {
            clrScr.clearScreen();
            Board.printboard(board);
            System.out.println("Player win ");
            return true;

        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;

                }
            }
        }
        return true;
    }
}
