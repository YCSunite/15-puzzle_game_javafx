import java.util.ArrayList;

// this class holds our data structure of the game board, and the AI solver. Also includes some handy functions for working with the game board


public class gameLogic {

	public static int whichPuzzle = 0;
	
	public DB_Solver2 ai;  // " = new DB_Solver2(node, <hueristicHere>) " will be called on this object when the user clicks the "solve with AI" buttons
	
	public ArrayList<Integer> gameBoardData;  // acts as the "under the hood" data structure storing our gameboard
	
	static public ArrayList<ArrayList<Integer>> puzzleList = new ArrayList<ArrayList<Integer>>(); // holds all the 10 puzzles for the user to solve.
	
	gameLogic() {				
		for (int i = 0; i < 10; i++) { // initialize the outer list
			puzzleList.add(new ArrayList<Integer>());
		}
		
		this.addPuzzles();
		gameBoardData = new ArrayList<Integer>(puzzleList.get(whichPuzzle));  // initializes the gameBoard to be the first puzzle in puzzleList
	}
	
	private void addPuzzles() {
		// begin puzzle one:
			puzzleList.get(0).add(2);
			puzzleList.get(0).add(6);
			puzzleList.get(0).add(10);
			puzzleList.get(0).add(3);
			puzzleList.get(0).add(1);
			puzzleList.get(0).add(4);
			puzzleList.get(0).add(7);
			puzzleList.get(0).add(11);
			puzzleList.get(0).add(8);
			puzzleList.get(0).add(5);
			puzzleList.get(0).add(9);
			puzzleList.get(0).add(15);
			puzzleList.get(0).add(12);
			puzzleList.get(0).add(13);
			puzzleList.get(0).add(14);
			puzzleList.get(0).add(0);
				
		// begin puzzle two:
			puzzleList.get(1).add(0);
			puzzleList.get(1).add(14);
			puzzleList.get(1).add(13);
			puzzleList.get(1).add(12);
			puzzleList.get(1).add(15);
			puzzleList.get(1).add(9);
			puzzleList.get(1).add(5);
			puzzleList.get(1).add(8);
			puzzleList.get(1).add(11);
			puzzleList.get(1).add(7);
			puzzleList.get(1).add(4);
			puzzleList.get(1).add(1);
			puzzleList.get(1).add(3);
			puzzleList.get(1).add(10);
			puzzleList.get(1).add(6);
			puzzleList.get(1).add(2);
			
		// begin puzzle three:
			puzzleList.get(2).add(15);
			puzzleList.get(2).add(2);
			puzzleList.get(2).add(1);
			puzzleList.get(2).add(12);
			puzzleList.get(2).add(8);
			puzzleList.get(2).add(5);
			puzzleList.get(2).add(6);
			puzzleList.get(2).add(11);
			puzzleList.get(2).add(4);
			puzzleList.get(2).add(9);
			puzzleList.get(2).add(10);
			puzzleList.get(2).add(7);
			puzzleList.get(2).add(3);
			puzzleList.get(2).add(14);
			puzzleList.get(2).add(13);
			puzzleList.get(2).add(0);
			
		// begin puzzle four:
			puzzleList.get(3).add(13);
			puzzleList.get(3).add(9);
			puzzleList.get(3).add(2);
			puzzleList.get(3).add(3);
			puzzleList.get(3).add(14);
			puzzleList.get(3).add(0);
			puzzleList.get(3).add(4);
			puzzleList.get(3).add(15);
			puzzleList.get(3).add(10);
			puzzleList.get(3).add(11);
			puzzleList.get(3).add(1);
			puzzleList.get(3).add(7);
			puzzleList.get(3).add(12);
			puzzleList.get(3).add(5);
			puzzleList.get(3).add(6);
			puzzleList.get(3).add(8);
			
		// begin puzzle five:
			puzzleList.get(4).add(15);
			puzzleList.get(4).add(14);
			puzzleList.get(4).add(8);
			puzzleList.get(4).add(12);
			puzzleList.get(4).add(10);
			puzzleList.get(4).add(11);
			puzzleList.get(4).add(9);
			puzzleList.get(4).add(13);
			puzzleList.get(4).add(2);
			puzzleList.get(4).add(6);
			puzzleList.get(4).add(5);
			puzzleList.get(4).add(1);
			puzzleList.get(4).add(3);
			puzzleList.get(4).add(7);
			puzzleList.get(4).add(4);
			puzzleList.get(4).add(0);
			
		// begin puzzle six:
			puzzleList.get(5).add(1);
			puzzleList.get(5).add(8);
			puzzleList.get(5).add(9);
			puzzleList.get(5).add(0);
			puzzleList.get(5).add(2);
			puzzleList.get(5).add(7);
			puzzleList.get(5).add(10);
			puzzleList.get(5).add(15);
			puzzleList.get(5).add(3);
			puzzleList.get(5).add(6);
			puzzleList.get(5).add(11);
			puzzleList.get(5).add(14);
			puzzleList.get(5).add(4);
			puzzleList.get(5).add(5);
			puzzleList.get(5).add(12);
			puzzleList.get(5).add(13);
			
		// begin puzzle seven:
			puzzleList.get(6).add(1);
			puzzleList.get(6).add(5);
			puzzleList.get(6).add(2);
			puzzleList.get(6).add(3);
			puzzleList.get(6).add(4);
			puzzleList.get(6).add(0);
			puzzleList.get(6).add(6);
			puzzleList.get(6).add(7);
			puzzleList.get(6).add(8);
			puzzleList.get(6).add(9);
			puzzleList.get(6).add(10);
			puzzleList.get(6).add(11);
			puzzleList.get(6).add(12);
			puzzleList.get(6).add(13);
			puzzleList.get(6).add(14);
			puzzleList.get(6).add(15);
			
		// begin puzzle eight:
			puzzleList.get(7).add(0);
			puzzleList.get(7).add(14);
			puzzleList.get(7).add(3);
			puzzleList.get(7).add(10);
			puzzleList.get(7).add(11);
			puzzleList.get(7).add(6);
			puzzleList.get(7).add(8);
			puzzleList.get(7).add(9);
			puzzleList.get(7).add(12);
			puzzleList.get(7).add(2);
			puzzleList.get(7).add(13);
			puzzleList.get(7).add(1);
			puzzleList.get(7).add(15);
			puzzleList.get(7).add(7);
			puzzleList.get(7).add(4);
			puzzleList.get(7).add(5);
			
		// begin puzzle nine:
			puzzleList.get(8).add(11);
			puzzleList.get(8).add(0);
			puzzleList.get(8).add(3);
			puzzleList.get(8).add(10);
			puzzleList.get(8).add(6);
			puzzleList.get(8).add(14);
			puzzleList.get(8).add(8);
			puzzleList.get(8).add(9);
			puzzleList.get(8).add(12);
			puzzleList.get(8).add(2);
			puzzleList.get(8).add(13);
			puzzleList.get(8).add(1);
			puzzleList.get(8).add(15);
			puzzleList.get(8).add(7);
			puzzleList.get(8).add(4);
			puzzleList.get(8).add(5);
			
		// begin puzzle 10:
			puzzleList.get(9).add(3);
			puzzleList.get(9).add(2);
			puzzleList.get(9).add(1);
			puzzleList.get(9).add(4);
			puzzleList.get(9).add(5);
			puzzleList.get(9).add(0);
			puzzleList.get(9).add(11);
			puzzleList.get(9).add(8);
			puzzleList.get(9).add(9);
			puzzleList.get(9).add(7);
			puzzleList.get(9).add(10);
			puzzleList.get(9).add(12);
			puzzleList.get(9).add(13);
			puzzleList.get(9).add(14);
			puzzleList.get(9).add(6);
			puzzleList.get(9).add(15);
	}
	
	// call this function every time the "new puzzle" button is clicked
	public void handleNewPuzzle() {
		if (whichPuzzle == 9) {
			whichPuzzle = 0;
		} else {
			whichPuzzle++;
		}
		
		gameBoardData = new ArrayList<Integer>(puzzleList.get(whichPuzzle));
	}
	
//	public boolean isValid(String whichTile) {
		// try to find a way to get our arrayList into a plain int array
//		
//		
////		int[] gameBoardDataArray = gameBoardData.toArray(gameBoardDataArray);
////		int zeroIndex = ai.findZero(gameBoardDataArray);
//	}
}
