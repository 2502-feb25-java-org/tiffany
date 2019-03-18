package com.revature.JDBCprac;


public class App 
{
    public static void main( String[] args )
    {
                //double kilometers = (100 * 1.609344); //double is the keyword and the rest is the expression(variables, values and operators)
        //int highscore = 50; // the entire line is the statement 
        
          calculateScore( true,800, 5,100); //make sure you call the method & add value here
          calculateScore(true, 10000, 8, 200);

          int highscorePosition =calculateHighScorePosition(1500);
          displayHighScorePosition("Tim", highscorePosition);
      
          highscorePosition =calculateHighScorePosition(900);
          displayHighScorePosition("Bob", highscorePosition);
      
          highscorePosition =calculateHighScorePosition(400);
          displayHighScorePosition("Percy", highscorePosition);
      
          highscorePosition =calculateHighScorePosition(150);
          displayHighScorePosition("Gil", highscorePosition);
         
          highscorePosition =calculateHighScorePosition(100);
          displayHighScorePosition("Jen", highscorePosition);
    }
        //methods is a better way of ensuring your code isn't duplicated and easier to maintain
    public static void calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) // this is a method and pass them in here.
    {
      

           if (gameOver) {
               int finalScore = score + (levelCompleted * bonus);
               finalScore += 2000;
               System.out.println("your final score was " + finalScore);
           }   
    }

///// display a player depending on their score what position theyre in
    public static void displayHighScorePosition(String playerName, int highscorePosition) 
{
    System.out.println(playerName+ " managed to get into position " + highscorePosition+ " on the high score title");
}

public static int calculateHighScorePosition( int playerScore) 
{
    if (playerScore >= 1000) {
        return 1;
    }
    else if (playerScore >=500 && playerScore < 1000)
    {
        return 2;
    }
    else if (playerScore >=100 && playerScore < 500)
    {
        return 3;
    } else 
    {
    return 4;
    }
}
}
