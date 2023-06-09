package controllers;
import models.*;
import views.*;
import views.scenes.*;

import javax.swing.*;
import java.util.*;

public class GameManager {
  private GameState gameState;
  //private Level[] levels = new Level[4];
    
  public GameManager(){
    gameState = new GameState();
  }
  
  public void startGame() {
        // Perform initialization tasks
        initializeGame();

        // Start the game loop
        while (!gameState.isGameOver()) {
            // Process user input
            processInput();

            // Update game state
            updateGameState();

            // Render game view
            render();
        }

        // Perform cleanup tasks
        endGame();
    }

    private void initializeGame() {
      
      SwingUtilities.invokeLater(() -> new SplashScreen());
      
      //levels[0] = new Level();
      //levels[1] = new Level1();
      //levels[2] = new Level2();
      //levels[3] = new Level3();
      
      //gameState.setLevel(levels[0]);
    }

    private void processInput() {
        // Handle user input events such as mouse clicks, key presses, etc.
        // Check user actions and update game state accordingly
        // Handle interactive events and outcomes
    }

    private void updateGameState() {
        // Update game state based on user input, game logic, etc.
        // Manage level and scene progression based on game state and user actions
        // Determine outcomes based on user actions and update game state accordingly
      
    }

    private void render() {
        // Render the game view based on the current game state
    }

    private void endGame() {
        // Perform cleanup tasks such as releasing resources, saving game state, etc.
    }
}
