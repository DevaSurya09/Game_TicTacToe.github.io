package com.TicTacToe;

import java.util.Scanner;

public class YON {
    public boolean yesNo(String massage) {
        Scanner yesOrNo = new Scanner(System.in);
        System.out.print("\n" + massage + " (y/n)? ");
        String yn = yesOrNo.next();
        while (!yn.equalsIgnoreCase("y") && !yn.equalsIgnoreCase("n")) {
            System.err.println("pilihan anda bukan y atau n");
            System.out.print("\n" + massage + " (y/n)? ");
            yn = yesOrNo.next();
            yesOrNo.close();
        }
        return yn.equalsIgnoreCase("y");
        
    }
}
