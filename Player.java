import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private char _playerSymbol;
    private Boolean _hasWon;
    private String _playerColor;
    private ArrayList<String> _addressesPlayedByPlayer = new ArrayList<>();

    static String greenText = "\u001B[32m";

    public Player(char playerSymbol, String playerColor)
    {
        _playerSymbol = playerSymbol;
        _playerColor = playerColor;
        _hasWon = false;
    }

    public Boolean HasPlayedHere(String id)
    {
        return _addressesPlayedByPlayer.contains(id);
    }

    public int GetNumberOfPlaysMade()
    {
        return _addressesPlayedByPlayer.size();
    }

    public char GetPlayerSymbol()
    {
        return _playerSymbol;
    }

    public void MakePlay(BoardAddress address)
    {
        address.ChangeAddressValuesWhenPlayed(_playerSymbol, _playerColor);
        _addressesPlayedByPlayer.add(address.GetID());
    }

    public String GetInputFromUser()
    {
        Scanner sc = new Scanner(System.in);  //System.in is a standard input stream  
        System.out.print("Where would you like to play? ");
        String str = sc.next();   //reads string before the space  
        return str;
    }

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
