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
    EventHandler<ActionEvent> gameButtonHandler = new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			// TODO: check that it's a valid move
    			
    			
    			
    			// TODO: check for a win
    		}
    };
    
    /* updates the gameBoard buttons with the values of the internal int array's values */
    private void drawGameBoard() {

    }

    public void exitGame(){

	}
}
