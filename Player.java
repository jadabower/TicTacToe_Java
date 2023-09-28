// imports to use ArrayList (for the list of addresses played by the player) and Scanner (to get information from the user)
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    // char that represents the player (either 'X' or 'O')
    private char _playerSymbol;
    // bool that keeps track of whether or not the player has won
    private Boolean _hasWon;
    // String that represents the player (either blue or red)
    private String _playerColor;
    // ArrayList that contains the id's of all the addresses played by this player
    private ArrayList<String> _addressesPlayedByPlayer = new ArrayList<>();

    // String to change the following printed statements to green
    static String greenText = "\u001B[32m";

    // constructor
    public Player(char playerSymbol, String playerColor)
    {
        _playerSymbol = playerSymbol;
        _playerColor = playerColor;
        _hasWon = false;
    }

    // checks if the player has played at a given id
    public Boolean HasPlayedHere(String id)
    {
        return _addressesPlayedByPlayer.contains(id);
    }

    // gets the numbers of plays made by this player
    public int GetNumberOfPlaysMade()
    {
        return _addressesPlayedByPlayer.size();
    }

    // gets the player symbol
    public char GetPlayerSymbol()
    {
        return _playerSymbol;
    }

    // changes the shown value of the address and sets the address to played, then adds the address to the list of played
    public void MakePlay(BoardAddress address)
    {
        address.ChangeAddressValuesWhenPlayed(_playerSymbol, _playerColor);
        _addressesPlayedByPlayer.add(address.GetID());
    }

    // gets input from the user in the form of a String
    public String GetInputFromUser()
    {
        Scanner sc = new Scanner(System.in);  // System.in is a standard input stream  
        System.out.print("Where would you like to play? ");
        String str = sc.next();   // reads string before the space  
        return str;
    }

    // if the player has won (in any of the 8 ways), returns true and sets the winning row to be green
    // otherwise, returns false
    public Boolean CheckIfWon(GameBoard board)
    {
        if (HasPlayedHere("a1") && HasPlayedHere("b1") && HasPlayedHere("c1"))
        {
            board.ChangeShownFromID("a1", greenText, _playerSymbol);
            board.ChangeShownFromID("b1", greenText, _playerSymbol);
            board.ChangeShownFromID("c1", greenText, _playerSymbol);
            _hasWon = true;
        } 
        else if (HasPlayedHere("a2") && HasPlayedHere("b2") && HasPlayedHere("c2"))
        {
            board.ChangeShownFromID("a2", greenText, _playerSymbol);
            board.ChangeShownFromID("b2", greenText, _playerSymbol);
            board.ChangeShownFromID("c2", greenText, _playerSymbol);
            _hasWon = true;
        } 
        else if (HasPlayedHere("a3") && HasPlayedHere("b3") && HasPlayedHere("c3"))
        {
            board.ChangeShownFromID("a3", greenText, _playerSymbol);
            board.ChangeShownFromID("b3", greenText, _playerSymbol);
            board.ChangeShownFromID("c3", greenText, _playerSymbol);
            _hasWon = true;
        }
        else if (HasPlayedHere("a1") && HasPlayedHere("a2") && HasPlayedHere("a3"))
        {
            board.ChangeShownFromID("a1", greenText, _playerSymbol);
            board.ChangeShownFromID("a2", greenText, _playerSymbol);
            board.ChangeShownFromID("a3", greenText, _playerSymbol);
            _hasWon = true;
        }
        else if (HasPlayedHere("b1") && HasPlayedHere("b2") && HasPlayedHere("b3"))
        {
            board.ChangeShownFromID("b1", greenText, _playerSymbol);
            board.ChangeShownFromID("b2", greenText, _playerSymbol);
            board.ChangeShownFromID("b3", greenText, _playerSymbol);
            _hasWon = true;
        }
        else if (HasPlayedHere("c1") && HasPlayedHere("c2") && HasPlayedHere("c3"))
        {
            board.ChangeShownFromID("c1", greenText, _playerSymbol);
            board.ChangeShownFromID("c2", greenText, _playerSymbol);
            board.ChangeShownFromID("c3", greenText, _playerSymbol);
            _hasWon = true;
        }
        else if (HasPlayedHere("a1") && HasPlayedHere("b2") && HasPlayedHere("c3"))
        {
            board.ChangeShownFromID("a1", greenText, _playerSymbol);
            board.ChangeShownFromID("b2", greenText, _playerSymbol);
            board.ChangeShownFromID("c3", greenText, _playerSymbol);
            _hasWon = true;
        }
        else if (HasPlayedHere("c1") && HasPlayedHere("b2") && HasPlayedHere("a3"))
        {
            board.ChangeShownFromID("c1", greenText, _playerSymbol);
            board.ChangeShownFromID("b2", greenText, _playerSymbol);
            board.ChangeShownFromID("a3", greenText, _playerSymbol);
            _hasWon = true;
        }
        else
        {
            _hasWon = false;
        }
        return _hasWon;
    }
}
