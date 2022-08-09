package com.TicTacToe;
public class winOrLose {
    public boolean win(char[][] board, char symbol) {
        if ((board[0][0] == symbol) && (board[0][1] == symbol) && (board[0][2] == symbol) ||
                (board[1][0] == symbol) && (board[1][1] == symbol) && (board[1][2] == symbol) ||
                (board[2][0] == symbol) && (board[2][1] == symbol) && (board[2][2] == symbol) ||

                (board[0][0] == symbol) && (board[1][0] == symbol) && (board[2][0] == symbol) ||
                (board[0][1] == symbol) && (board[1][1] == symbol) && (board[2][1] == symbol) ||
                (board[0][2] == symbol) && (board[1][2] == symbol) && (board[2][2] == symbol) ||

                (board[0][0] == symbol) && (board[1][1] == symbol) && (board[2][2] == symbol) ||
                (board[0][2] == symbol) && (board[1][1] == symbol) && (board[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    public boolean draw(char[][] board) {
        if (!(board[0][0] == ' ') && !(board[0][1] == ' ') && !(board[0][2] == ' ') && !(board[1][0] == ' ')
                && !(board[1][1] == ' ') && !(board[1][2] == ' ') && !(board[2][0] == ' ') && !(board[2][1] == ' ')
                && !(board[2][2] == ' ')) {
            return true;
        }
        return false;
    }

    public boolean drawWin(char[][] board) {
        if ((board[0][0] == 'X') && (board[0][1] == 'X') && (board[0][2] == 'X') &&
                !(board[1][0] == ' ') && !(board[1][1] == ' ') && !(board[1][2] == ' ') &&
                !(board[2][0] == ' ') && !(board[2][1] == ' ') && !(board[2][2] == ' ') ||
                !(board[0][0] == ' ') && !(board[0][1] == ' ') && !(board[0][2] == ' ') &&
                        (board[1][0] == 'X') && (board[1][1] == 'X') && (board[1][2] == 'X') &&
                        !(board[2][0] == ' ') && !(board[2][1] == ' ') && !(board[2][2] == ' ')
                ||
                !(board[0][0] == ' ') && !(board[0][1] == ' ') && !(board[0][2] == ' ') &&
                        !(board[1][0] == ' ') && !(board[1][1] == ' ') && !(board[1][2] == ' ') &&
                        (board[2][0] == 'X') && (board[2][1] == 'X') && (board[2][2] == 'X')
                ||

                (board[0][0] == 'X') && !(board[0][1] == ' ') && !(board[0][2] == ' ') &&
                        (board[1][0] == 'X') && !(board[1][1] == ' ') && !(board[1][2] == ' ') &&
                        (board[2][0] == 'X') && !(board[2][1] == ' ') && !(board[2][2] == ' ')
                ||
                !(board[0][0] == ' ') && (board[0][1] == 'X') && !(board[0][2] == ' ') &&
                        !(board[1][0] == ' ') && (board[1][1] == 'X') && !(board[1][2] == ' ') &&
                        !(board[2][0] == ' ') && (board[2][1] == 'X') && !(board[2][2] == ' ')
                ||
                !(board[0][0] == ' ') && !(board[0][1] == ' ') && (board[0][2] == 'X') &&
                        !(board[1][0] == ' ') && !(board[1][1] == ' ') && (board[1][2] == 'X') &&
                        !(board[2][0] == ' ') && !(board[2][1] == ' ') && (board[2][2] == 'X')
                ||

                (board[0][0] == 'X') && !(board[0][1] == ' ') && !(board[0][2] == ' ') &&
                        !(board[1][0] == ' ') && (board[1][1] == 'X') && !(board[1][2] == ' ') &&
                        !(board[2][0] == ' ') && !(board[2][1] == ' ') && (board[2][2] == 'X')
                ||
                !(board[0][0] == ' ') && !(board[0][1] == ' ') && (board[0][2] == 'X') &&
                        !(board[1][0] == ' ') && (board[1][1] == 'X') && !(board[1][2] == ' ') &&
                        (board[2][0] == 'X') && !(board[2][1] == ' ') && !(board[2][2] == ' ')) {
            return true;
        }
        return false;
    }

}
