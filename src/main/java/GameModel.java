import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.net.URL;
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
    	
    }
    
    /* this is the main function for all of the tiles in the gameboard */
    public void makeMove() {
    			// TODO: check that it's a valid move
    			// TODO: swap the tiles
    			drawGameBoard();
    			// TODO: check for a win
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

    public void exitGame(){

	}
}
