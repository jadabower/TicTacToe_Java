// import java.util.Scanner;
import java.io.*;

public class TicTacToe {
    public static void main(String args[])
	{
        String resetColor = "\u001B[0m";
        String blueText = "\u001B[34m";
        String redText = "\u001B[31m";
        Player player1 = new Player('X', blueText);
        Player player2 = new Player('O', redText);
        GameBoard board = new GameBoard();
        int turnCount = 0;

        while((player1.CheckIfWon(board) == false) && (player2.CheckIfWon(board) == false) && (player1.GetNumberOfPlaysMade() + player2.GetNumberOfPlaysMade() != 9))
        {
            if((turnCount % 2) == 0)
            {
                turnCount ++;
                System.out.println("----------------------------------------");
                System.out.println(blueText + "Player 1" + resetColor + "'s Turn");
                board.PrintCurrentGameBoard();
                String addressAsString = player1.GetInputFromUser().toLowerCase();
                while ((player1.HasPlayedHere(addressAsString) || player2.HasPlayedHere(addressAsString)) || !board.GetIfAddressIsValid(addressAsString))
                {
                    char firstChar = addressAsString.charAt(0);
                    if (Character.isDigit(firstChar))
                    { 
                        addressAsString = Character.toString(addressAsString.charAt(1)) + Character.toString(firstChar);
                    }
                    if ((player1.HasPlayedHere(addressAsString) || player2.HasPlayedHere(addressAsString)) || !board.GetIfAddressIsValid(addressAsString))
                    {
                        System.out.println("Please enter an empty board address.");
                        addressAsString = player1.GetInputFromUser().toLowerCase();
                    }
                }
                player1.MakePlay(board.GetBoardAddressFromID(addressAsString));
                if (player1.CheckIfWon(board))
                {
                    System.out.println("----------------------------------------");
                    System.out.println(blueText + "Player 1" + resetColor + " won in " + turnCount + " turns!");
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
                System.out.println(redText + "Player 2" + resetColor + "'s Turn");
                board.PrintCurrentGameBoard();
                String addressAsString = player2.GetInputFromUser().toLowerCase();
                while ((player1.HasPlayedHere(addressAsString) || player2.HasPlayedHere(addressAsString)) || !board.GetIfAddressIsValid(addressAsString))
                {
                    char firstChar = addressAsString.charAt(0);
                    if (Character.isDigit(firstChar))
                    { 
                        addressAsString = Character.toString(addressAsString.charAt(1)) + Character.toString(firstChar);
                    }
                    if ((player1.HasPlayedHere(addressAsString) || player2.HasPlayedHere(addressAsString)) || !board.GetIfAddressIsValid(addressAsString))
                    {
                        System.out.println("Please enter an empty board address.");
                        addressAsString = player1.GetInputFromUser().toLowerCase();
                    }
                }
                player2.MakePlay(board.GetBoardAddressFromID(addressAsString));
                if (player2.CheckIfWon(board))
                {
                    System.out.println("----------------------------------------");
                    System.out.println(redText + "Player 2" + resetColor + " won in " + turnCount + " turns!");
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
