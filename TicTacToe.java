public class TicTacToe {
    public static void main(String args[])
	{
        // String to change the following printed statements back to default
        String resetColor = "\u001B[0m";
        // String to change the following printed statements to blue
        String blueText = "\u001B[34m";
        // String to change the following printed statements to red
        String redText = "\u001B[31m";
        // creates two Players
        Player player1 = new Player('X', blueText);
        Player player2 = new Player('O', redText);
        // creates a GameBoard
        GameBoard board = new GameBoard();
        // int to keep track of how many turns have been played
        int turnCount = 0;

        // runs the game while it should still be running
        while((player1.CheckIfWon(board) == false) && (player2.CheckIfWon(board) == false) && (player1.GetNumberOfPlaysMade() + player2.GetNumberOfPlaysMade() != 9))
        {
            // player 1's turn
            if((turnCount % 2) == 0)
            {
                // increments the turn counter
                turnCount ++;
                // clears the terminal
                System.out.print("\033[H\033[2J");
                // prints that it's player 1's turn and the current game board
                System.out.println(blueText + "Player 1" + resetColor + "'s turn");
                board.PrintCurrentGameBoard();
                // gets an address from the user where they want to play
                String addressAsString = player1.GetInputFromUser().toLowerCase();
                // handles invalid addresses entered
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
                // makes player 1 play at the address entered
                player1.MakePlay(board.GetBoardAddressFromID(addressAsString));
                // prints player 1 winning message and board
                if (player1.CheckIfWon(board))
                {
                    // clears the terminal
                    System.out.print("\033[H\033[2J");
                    System.out.println(blueText + "Player 1" + resetColor + " won in " + turnCount + " turns!");
                    board.PrintCurrentGameBoard();
                }
                // prints tie message and board
                else if (player1.GetNumberOfPlaysMade() + player2.GetNumberOfPlaysMade() == 9)
                {
                    // clears the terminal
                    System.out.print("\033[H\033[2J");
                    System.out.println("It's a tie!");
                    board.PrintCurrentGameBoard();
                }
            }
            // player 2's turn
            else
            {
                // increments the turn counter
                turnCount ++;
                // clears the terminal
                System.out.print("\033[H\033[2J");
                // prints that it's player 2's turn and the current game board
                System.out.println(redText + "Player 2" + resetColor + "'s turn");
                board.PrintCurrentGameBoard();
                // gets an address from the user where they want to play
                String addressAsString = player2.GetInputFromUser().toLowerCase();
                // handles invalid addresses entered
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
                // makes player 2 play at the address entered
                player2.MakePlay(board.GetBoardAddressFromID(addressAsString));
                // prints player 2 winning message and board
                if (player2.CheckIfWon(board))
                {
                    // clears the terminal
                    System.out.print("\033[H\033[2J");
                    System.out.println(redText + "Player 2" + resetColor + " won in " + turnCount + " turns!");
                    board.PrintCurrentGameBoard();
                }
                // prints tie message and board
                else if (player1.GetNumberOfPlaysMade() + player2.GetNumberOfPlaysMade() == 9)
                {
                    // clears the terminal
                    System.out.print("\033[H\033[2J");
                    System.out.println("It's a tie!");
                    board.PrintCurrentGameBoard();
                }
            }
        }
	}
}
