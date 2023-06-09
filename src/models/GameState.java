package models;
import controllers.*;

public class GameState {
    private static int score;
    private static boolean isGameOver;
    private static boolean isLevelOver;
    private static boolean is2D;
    private static boolean isPointClick;
    private static boolean isCorrectAns;
        
    public GameState() {
        score = 0;
        isGameOver = false;
        is2D = false;
        isCorrectAns = false;
        isLevelOver = false;
    }

    public static int getScore() {
        return score;
    }

    public static void increaseScore(int points) {
        score += points;
    }

    public static boolean isGameOver() {
        return isGameOver;
    }

    public static void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }
    
    
    public static boolean isLevelOver() {
        return isLevelOver;
    }

    public static void setLevelOver(boolean levelOver) {
        isLevelOver = levelOver;
    }
    
    public static boolean is2D() {
        return is2D;
    }
    
    public static void set2D(boolean is2d) {
        is2D = is2d;
    }
    
    public static boolean isPointClick() {
        return isPointClick;
    }
    
    public static void setPointClick(boolean pointClick) {
        isPointClick = pointClick;
    }
    
    public static boolean isCorrectAns() {
        return isCorrectAns;
    }
    
    public static void answer(boolean ans){
        isCorrectAns = ans;   
    }
}
