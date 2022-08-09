package com.TicTacToe;

import java.util.Random;
import java.util.Scanner;

class scor {
    public void data() {
        System.out.println("---------+---------");
        System.out.println("| player |   bot  |");
        System.out.println("---------+---------");
    }
}

class garis extends scor {
    public void data() {
        System.out.println("---------+--------");
    }
}

public class Main {

    public static void main(String[] args) {
        Draw draw = new Draw();
        Finish end = new Finish();
        CS clrScr = new CS();
        clrScr.clearScreen();
        YON yon = new YON();
        boolean next = true;
        int nilai1 = 0;
        int nilai2 = 0;

        while (next) {

            Scanner scanner = new Scanner(System.in);
            B Board = new B();
            char[][] board = { { ' ', ' ', ' ' },
                    { ' ', ' ', ' ' },
                    { ' ', ' ', ' ', ' ' } };
            Board.printboard(board);

            while (true) {
                Board.printboard(board);
                clrScr.clearScreen();
                playerTurn(board, scanner);

                if (end.isGameFinish4(board)) {
                    scor myP = new scor();
                    scor myPlayer = new garis();
                    myP.data();
                    nilai1++;
                    System.out.printf("|   %-5d|   %-5d|\n", nilai1, nilai2);
                    myPlayer.data();
                    break;
                }
                Board.printboard(board);
                if (draw.isGameFinish3(board)) {
                    scor myD = new scor();
                    scor myDraw = new garis();
                    myD.data();

                    System.out.printf("|   %-5d|   %-5d|\n", nilai1, nilai2);
                    myDraw.data();
                    break;
                }

                Board.printboard(board);
                computerTurn(board);
                if (end.isGameFinish2(board)) {
                    scor myB = new scor();
                    scor myBot = new garis();

                    myB.data();
                    nilai2++;
                    System.out.printf("|   %-5d|   %-5d|\n", nilai1, nilai2);
                    myBot.data();
                    break;
                }

                Board.printboard(board);
                if (end.isGameFinish1(board)) {
                    scor myP = new scor();
                    scor myPlayer = new garis();
                    myP.data();
                    nilai1++;
                    System.out.printf("|   %-5d|   %-5d|\n", nilai1, nilai2);
                    myPlayer.data();
                    break;
                }
                Board.printboard(board);

            }

            next = yon.yesNo("ingin main lagi?");
        }
    }



    private static boolean isValidMove(char[][] board, String position) {
        switch (position) {
            case "1":
                return (board[0][0] == ' ');
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
                return (board[1][0] == ' ');
            case "5":
                return (board[1][1] == ' ');
            case "6":
                return (board[1][2] == ' ');
            case "7":
                return (board[2][0] == ' ');
            case "8":
                return (board[2][1] == ' ');
            case "9":
                return (board[2][2] == ' ');
            default:

                return false;
        }
    }

    private static void computerTurn(char[][] board) {
        Random rand = new Random();
        int computerMove;
        while (true) {
            computerMove = rand.nextInt(9) + 1;
            if (isValidMove(board, Integer.toString(computerMove))) {
                break;
            }
        }
        System.out.println("computer chose" + computerMove);
        placeMove(board, Integer.toString(computerMove), 'O');

    }

    private static void playerTurn(char[][] board, Scanner scanner) {
        String userInput;
        B Board = new B();
        CS clrScr = new CS();
        while (true) {
            Board.printboard(board);
            System.out.print("1-9: ");
            userInput = scanner.nextLine();
            if (isValidMove(board, userInput)) {
                break;
            } else {
                clrScr.clearScreen();
                System.out.println(userInput + " sudah ada ");
            }

        }
        placeMove(board, userInput, 'X');
    }

    private static void placeMove(char[][] board, String position, char symbol) {

        switch (position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println(":)");
                break;
        }
    }

}
