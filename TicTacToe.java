public class TicTacToe {
    public static void main(String args[])
	{
        Player player1 = new Player('X');
        Player player2 = new Player('O');
        BoardAddress a1 = new BoardAddress("a1");
        BoardAddress b1 = new BoardAddress("b1");
        BoardAddress c1 = new BoardAddress("c1");
        BoardAddress a2 = new BoardAddress("a2");
        BoardAddress b2 = new BoardAddress("b2");
        BoardAddress c2 = new BoardAddress("c2");
        BoardAddress a3 = new BoardAddress("a3");
        BoardAddress b3 = new BoardAddress("b3");
        BoardAddress c3 = new BoardAddress("c3");
        GameBoard board = new GameBoard(a1, b1, c1, a2, b2, c2, a3, b3, c3);
        // Tests:
        board.PrintCurrentGameBoard();
        player1.MakePlay(a1);
        board.PrintCurrentGameBoard();
        player2.MakePlay(a2);
        board.PrintCurrentGameBoard();
	}
}
