import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// handles the 10 test cases for the AI

class AITest {

	public DB_Solver2 solverH1;
	public DB_Solver2 solverH2;
	public Node tmpNode;
	public Node tmpNode2;
	public int[] gameBoard = {0, 14, 13, 12, 15, 9, 5, 8, 11, 7, 4, 1, 3, 10, 6, 2};
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		/* resets all the values in the array to be what they were */
		gameBoard[0] = 0;
		gameBoard[1] = 14;
		gameBoard[2] = 13;
		gameBoard[3] = 12;
		gameBoard[4] = 15;
		gameBoard[5] = 9;
		gameBoard[6] = 5;
		gameBoard[7] = 8;
		gameBoard[8] = 11;
		gameBoard[9] = 7;
		gameBoard[10] = 4;
		gameBoard[11] = 1;
		gameBoard[12] = 3;
		gameBoard[13] = 10;
		gameBoard[14] = 6;
		gameBoard[15] = 2;
		
		tmpNode = new Node(gameBoard);
		tmpNode2 = new Node(gameBoard);
		solverH1 = new DB_Solver2(tmpNode, "heuristicOne");
		solverH2 = new DB_Solver2(tmpNode2, "heuristicTwo");
	}


	@Test
	void copyArrayTest() {
		assertArrayEquals(solverH1.copyArray(gameBoard), gameBoard, "DB_Solver2 copyArray() didn't return the correct array");
	}
	
	@Test
	void goalTestOne() {
		assertEquals(solverH1.goalTest(gameBoard), false, "DB_Solver2 goalTest() returned true on an unsolved game board");
	}
	
	@Test
	void goalTestTwo() {
		/* manually set the board to a solved state (will be reset for next test in beforeEach block */
		gameBoard[0] = 0;
		gameBoard[1] = 1;
		gameBoard[2] = 2;
		gameBoard[3] = 3;
		gameBoard[4] = 4;
		gameBoard[5] = 5;
		gameBoard[6] = 6;
		gameBoard[7] = 7;
		gameBoard[8] = 8;
		gameBoard[9] = 9;
		gameBoard[10] = 10;
		gameBoard[11] = 11;
		gameBoard[12] = 12;
		gameBoard[13] = 13;
		gameBoard[14] = 14;
		gameBoard[15] = 15;
		assertEquals(solverH1.goalTest(gameBoard), true, "DB_Solver2 goalTest() returned false on a solved game board");
	}

	@Test
	void getH1Test() {
		/* manually set the board to a state where there's 2 tiles out of place ('1', and '2' are swapped) */
		gameBoard[0] = 0;
		gameBoard[1] = 2;
		gameBoard[2] = 1;
		gameBoard[3] = 3;
		gameBoard[4] = 4;
		gameBoard[5] = 5;
		gameBoard[6] = 6;
		gameBoard[7] = 7;
		gameBoard[8] = 8;
		gameBoard[9] = 9;
		gameBoard[10] = 10;
		gameBoard[11] = 11;
		gameBoard[12] = 12;
		gameBoard[13] = 13;
		gameBoard[14] = 14;
		gameBoard[15] = 15;
		assertEquals(solverH1.getH1(gameBoard), 2, "DB_Solver2 getH1() returned the wrong number of tiles that were out of place");
	}
	
	@Test
	void getH1EdgeCaseTest() {
		/* test the edge case where no tiles are out of place */
		gameBoard[0] = 0;
		gameBoard[1] = 1;
		gameBoard[2] = 2;
		gameBoard[3] = 3;
		gameBoard[4] = 4;
		gameBoard[5] = 5;
		gameBoard[6] = 6;
		gameBoard[7] = 7;
		gameBoard[8] = 8;
		gameBoard[9] = 9;
		gameBoard[10] = 10;
		gameBoard[11] = 11;
		gameBoard[12] = 12;
		gameBoard[13] = 13;
		gameBoard[14] = 14;
		gameBoard[15] = 15;
		assertEquals(solverH1.getH1(gameBoard), 0, "DB_Solver2 getH1() returned the wrong number of tiles that were out of place (for edge case where no tiles were out of place)");	
	}
	
	@Test
	void getH2Test() {
		/* manually set the board to where only 1 and 2 are swapped. The manhatten distance for these pieces should be "1" each which will sum to 2. */
		gameBoard[0] = 0;
		gameBoard[1] = 2;
		gameBoard[2] = 1;
		gameBoard[3] = 3;
		gameBoard[4] = 4;
		gameBoard[5] = 5;
		gameBoard[6] = 6;
		gameBoard[7] = 7;
		gameBoard[8] = 8;
		gameBoard[9] = 9;
		gameBoard[10] = 10;
		gameBoard[11] = 11;
		gameBoard[12] = 12;
		gameBoard[13] = 13;
		gameBoard[14] = 14;
		gameBoard[15] = 15;
		assertEquals(solverH1.getH2(gameBoard), 2, "DB_Solver2 getH2() returned the wrong manhatten distance");
	}
	
	@Test
	void getH2EdgeCaseTest() {
		/* manually solve board. All pieces are where they should be, and thus the total manhatten distance should be 0 (i.e. each piece is 0) */
		gameBoard[0] = 0;
		gameBoard[1] = 1;
		gameBoard[2] = 2;
		gameBoard[3] = 3;
		gameBoard[4] = 4;
		gameBoard[5] = 5;
		gameBoard[6] = 6;
		gameBoard[7] = 7;
		gameBoard[8] = 8;
		gameBoard[9] = 9;
		gameBoard[10] = 10;
		gameBoard[11] = 11;
		gameBoard[12] = 12;
		gameBoard[13] = 13;
		gameBoard[14] = 14;
		gameBoard[15] = 15;
		assertEquals(solverH1.getH1(gameBoard), 0, "DB_Solver2 getH2() return a non-zero value for an already solved board");
	}
	
	@Test
	void findSolutionPathTest() {
		int[] solvedBoard = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		assertArrayEquals(solverH1.findSolutionPath().getKey(), solvedBoard, "DB_Solver2 findSolutionPath() failed to return a Node with a correctly solved board");
	}
	
	@Test
	void findSolutionPathTestTwo() {  // test already solved board edge case
		int[] solvedBoard = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		DB_Solver2 tmpSolver = new DB_Solver2(new Node(solvedBoard), "heuristicOne");
		assertArrayEquals(tmpSolver.findSolutionPath().getKey(), solvedBoard, "DB_Solver2 findSolutionPath() failed to return correctly when given an already solved board");
	}
	
	@Test
	void findZeroTest() {
		assertEquals(solverH1.findZero(gameBoard), 0, "DB_Solver2 findZero() returned incorrect index of the blank space");
	}
	
	@Test
	void findZeroTestTwo() {
		gameBoard[0] = 1;  // test a game board that doesn't have a blank square
		assertEquals(solverH1.findZero(gameBoard), -1, "DB_Solver2 findZero() returned incorrect value for a gameBoard with no blank space");
	}
}