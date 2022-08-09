package com.TicTacToe;
public class Draw {
    public boolean isGameFinish3(char[][] board) {
        winOrLose wol = new winOrLose();
        Finish D = new Finish();
        B Board = new B();
        CS clrScr = new CS();

        if (wol.draw(board) && !D.isGameFinish1(board) && !D.isGameFinish2(board)) {
            clrScr.clearScreen();
            Board.printboard(board);
            System.out.println("draw ");
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
