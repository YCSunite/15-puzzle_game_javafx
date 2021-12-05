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
	
	private DB_Solver2 ai;  // " = new DB_Solver2(node, <hueristicHere>) " will be called on this object when the user clicks the "solve with AI" buttons
	
	private ArrayList<Integer> gameBoardData;  // acts as the "under the hood" data structure storing our gameboard
	
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
    	this.gameButton0.setText(this.gameBoardData.get(0).toString());
    	this.gameButton1.setText(this.gameBoardData.get(1).toString());
    	this.gameButton2.setText(this.gameBoardData.get(2).toString());
    	this.gameButton3.setText(this.gameBoardData.get(3).toString());
    	this.gameButton4.setText(this.gameBoardData.get(4).toString());
    	this.gameButton5.setText(this.gameBoardData.get(5).toString());
    	this.gameButton6.setText(this.gameBoardData.get(6).toString());
    	this.gameButton7.setText(this.gameBoardData.get(7).toString());
    	this.gameButton8.setText(this.gameBoardData.get(8).toString());
    	this.gameButton9.setText(this.gameBoardData.get(9).toString());
    	this.gameButton10.setText(this.gameBoardData.get(10).toString());
    	this.gameButton11.setText(this.gameBoardData.get(11).toString());
    	this.gameButton12.setText(this.gameBoardData.get(12).toString());
    	this.gameButton13.setText(this.gameBoardData.get(13).toString());
    	this.gameButton14.setText(this.gameBoardData.get(14).toString());
    	this.gameButton15.setText(this.gameBoardData.get(15).toString());
    }

    public void exitGame(){

	}
}
