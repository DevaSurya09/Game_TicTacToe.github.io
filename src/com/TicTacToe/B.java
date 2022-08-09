package com.TicTacToe;
public class B {

    public void printboard(char[][] board) {
        System.out.println("\t|-----|");
        System.out.println("\t|"+board[0][0] + "|" + board[0][1] + "|" + board[0][2]+"|");
        System.out.println("\t|-+-+-|");
        System.out.println("\t|"+board[1][0] + "|" + board[1][1] + "|" + board[1][2]+"|");
        System.out.println("\t|-+-+-|");
        System.out.println("\t|"+board[2][0] + "|" + board[2][1] + "|" + board[2][2]+"|");
        System.out.println("\t|-----|\n");
    }
}
