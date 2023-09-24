// import java.util.Scanner;

public class TicTacToe {
    public static void main(String args[])
	{
        Player player1 = new Player('X');
        Player player2 = new Player('O');
        GameBoard board = new GameBoard();
        int turnCount = 0;

        while((player1.CheckIfWon() == false) && (player2.CheckIfWon() == false) && (player1.GetNumberOfPlaysMade() + player2.GetNumberOfPlaysMade() != 9))
        {
            if((turnCount % 2) == 0)
            {
                turnCount ++;
                System.out.println("----------------------------------------");
                System.out.println("Player 1's Turn");
                board.PrintCurrentGameBoard();
                String addressAsString = player1.GetInputFromUser().toLowerCase();
                while ((player1.HasPlayedHere(addressAsString) || player2.HasPlayedHere(addressAsString)) || !board.GetIfAddressIsValid(addressAsString))
                {
                    System.out.println("Please enter an empty board address.");
                    addressAsString = player1.GetInputFromUser().toLowerCase();
                }
                player1.MakePlay(board.GetBoardAddressFromID(addressAsString));
                if (player1.CheckIfWon())
                {
                    System.out.println("----------------------------------------");
                    System.out.println("Player 1 won in " + turnCount + " turns!");
                    board.PrintCurrentGameBoard();
                    System.out.println("----------------------------------------");
                }
                else if (player1.GetNumberOfPlaysMade() + player2.GetNumberOfPlaysMade() == 9)
                {
                    System.out.println("----------------------------------------");
                    System.out.println("It's a tie!");
                    board.PrintCurrentGameBoard();
                    System.out.println("----------------------------------------");
                }
            }
            else
            {
                turnCount ++;
                System.out.println("----------------------------------------");
                System.out.println("Player 2's Turn");
                board.PrintCurrentGameBoard();
                String addressAsString = player2.GetInputFromUser().toLowerCase();
                while ((player1.HasPlayedHere(addressAsString) || player2.HasPlayedHere(addressAsString)) || !board.GetIfAddressIsValid(addressAsString))
                {
                    System.out.println("Please enter an empty board address.");
                    addressAsString = player2.GetInputFromUser().toLowerCase();
                }
                player2.MakePlay(board.GetBoardAddressFromID(addressAsString));
                if (player2.CheckIfWon())
                {
                    System.out.println("----------------------------------------");
                    System.out.println("Player 2 won in " + turnCount + " turns!");
                    board.PrintCurrentGameBoard();
                    System.out.println("----------------------------------------");
                }
                else if (player1.GetNumberOfPlaysMade() + player2.GetNumberOfPlaysMade() == 9)
                {
                    System.out.println("----------------------------------------");
                    System.out.println("It's a tie!");
                    board.PrintCurrentGameBoard();
                    System.out.println("----------------------------------------");
                }
            }
        }
	}
}
