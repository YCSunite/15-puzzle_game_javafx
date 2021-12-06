import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.util.Duration;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ResourceBundle;

//controller for the game scene
public class GameModel implements Initializable {
	
	private gameLogic logicBot = new gameLogic();
	
	/* These are the individual tiles on the game board. Note that they are zero-indexed in case we may want to add the to an array later */
	@FXML
	private Button gameButton0; 
	
	@FXML
	private Button gameButton1; 
	
	@FXML
	private Button gameButton2;
	
	@FXML
	private Button gameButton3;
	
	@FXML
	private Button gameButton4;
	
	@FXML
	private Button gameButton5;
	
	@FXML
	private Button gameButton6; 
	
	@FXML
	private Button gameButton7; 
	
	@FXML
	private Button gameButton8; 
	
	@FXML
	private Button gameButton9;
	
	@FXML
	private Button gameButton10;
	
	@FXML
	private Button gameButton11;
	
	@FXML
	private Button gameButton12; 
	
	@FXML
	private Button gameButton13; 
	
	@FXML
	private Button gameButton14; 
	
	@FXML
	private Button gameButton15; 
	
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	drawGameBoard();
    }
    
    /* this is the main function for all of the tiles in the gameboard
     * 1) check if move is valid
     * 2) if it is swap tiles
     * 3) redraw the gameBoard
     * 4) check if there is win
     *  */
    public void makeMove(int whichButton) throws Exception {
    			if (logicBot.isValid(whichButton)) {
    				//swap the two button's text in the data structure under the hood
    				int indexOfZero = logicBot.findZero(logicBot.gameBoardData);
    				
    				int tmp = logicBot.gameBoardData.get(whichButton);
    				logicBot.gameBoardData.set(whichButton, 0);
    				logicBot.gameBoardData.set(indexOfZero, tmp);
    			}
    			
    			drawGameBoard();
    			
    			if (logicBot.isSolved()) {
    				JavaFXTemplate.switchToVictoryScene();
    			}
    }
    
    
    // these are used by the individual gameButtons, so that we can tell which individual game button was clicked
    public void gameButton0Click() throws Exception {
    	makeMove(0);
    }
    
    public void gameButton1Click() throws Exception {
    	makeMove(1);
    }
    
    public void gameButton2Click() throws Exception {
    	makeMove(2);
    }
    
    public void gameButton3Click() throws Exception {
    	makeMove(3);
    }
    
    public void gameButton4Click() throws Exception {
    	makeMove(4);
    }
    
    public void gameButton5Click() throws Exception {
    	makeMove(5);
    }
    
    public void gameButton6Click() throws Exception {
    	makeMove(6);
    }
    
    public void gameButton7Click() throws Exception {
    	makeMove(7);
    }
    
    public void gameButton8Click() throws Exception {
    	makeMove(8);
    }
    
    public void gameButton9Click() throws Exception {
    	makeMove(9);
    }
    
    public void gameButton10Click() throws Exception {
    	makeMove(10);
    }
    
    public void gameButton11Click() throws Exception {
    	makeMove(11);
    }
    
    public void gameButton12Click() throws Exception {
    	makeMove(12);
    }
    
    public void gameButton13Click() throws Exception {
    	makeMove(13);
    }
    
    public void gameButton14Click() throws Exception {
    	makeMove(14);
    }
    
    public void gameButton15Click() throws Exception {
    	makeMove(15);
    }
    
    /* updates the gameBoard buttons with the values of the internal int array's values */
    private void drawGameBoard() {
    	this.gameButton0.setText(logicBot.gameBoardData.get(0).toString());
    	this.gameButton1.setText(logicBot.gameBoardData.get(1).toString());
    	this.gameButton2.setText(logicBot.gameBoardData.get(2).toString());
    	this.gameButton3.setText(logicBot.gameBoardData.get(3).toString());
    	this.gameButton4.setText(logicBot.gameBoardData.get(4).toString());
    	this.gameButton5.setText(logicBot.gameBoardData.get(5).toString());
    	this.gameButton6.setText(logicBot.gameBoardData.get(6).toString());
    	this.gameButton7.setText(logicBot.gameBoardData.get(7).toString());
    	this.gameButton8.setText(logicBot.gameBoardData.get(8).toString());
    	this.gameButton9.setText(logicBot.gameBoardData.get(9).toString());
    	this.gameButton10.setText(logicBot.gameBoardData.get(10).toString());
    	this.gameButton11.setText(logicBot.gameBoardData.get(11).toString());
    	this.gameButton12.setText(logicBot.gameBoardData.get(12).toString());
    	this.gameButton13.setText(logicBot.gameBoardData.get(13).toString());
    	this.gameButton14.setText(logicBot.gameBoardData.get(14).toString());
    	this.gameButton15.setText(logicBot.gameBoardData.get(15).toString());
    }
    
    public void newPuzzle() {
    	logicBot.handleNewPuzzle();
    	this.drawGameBoard();
    }
    
    public void solveWithAIOne() {  // make this run on its own thread
    	logicBot.solveWithAIOne();
    }
    
    public void solveWithAITwo() {  // make this run on its own thread too
    	logicBot.solveWithAITwo();
    }
    
    public void showSolution() {  // animate move by move, and check if it's the solution each time. If it is, pause, then break out of the loop and go to congrats screen.
    	
    }

    public void exitGame(){
    	System.exit(0);
	}
}
