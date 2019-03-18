package com.revature.JDBCprac;

public class overloading {

    public static void main(String[] args) {
        int newScore= calculateScore("tiff", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " +score );
        return  score * 10;
        
    }

    public static int calculateScore( int score) {
        System.out.println(" unnamed Player  " + " scored " +score );
        return  score * 10;
        
    }
    public static int calculateScore() {
        System.out.println("Player  unnamed didn't score" );
        return 0;
        
    }
}