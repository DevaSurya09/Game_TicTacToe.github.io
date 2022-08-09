package com.TicTacToe;
public class CS {
    public void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }

    }
}
