import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private char _playerSymbol;
    private Boolean _hasWon;
    private ArrayList<String> _addressesPlayedByPlayer = new ArrayList<>();

    public Player(char playerSymbol)
    {
        _playerSymbol = playerSymbol;
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
        address.ChangeAddressValuesWhenPlayed(_playerSymbol);
        _addressesPlayedByPlayer.add(address.GetID());
    }

    public String GetInputFromUser()
    {
        Scanner sc = new Scanner(System.in);  //System.in is a standard input stream  
        System.out.print("Where would you like to play? ");
        String str = sc.next();   //reads string before the space  
        return str;
    }

    public Boolean CheckIfWon()
    {
        if (HasPlayedHere("a1") && HasPlayedHere("b1") && HasPlayedHere("c1"))
        {
            _hasWon = true;
        } 
        else if (HasPlayedHere("a2") && HasPlayedHere("b2") && HasPlayedHere("c2"))
        {
            _hasWon = true;
        } 
        else if (HasPlayedHere("a3") && HasPlayedHere("b3") && HasPlayedHere("c3"))
        {
            _hasWon = true;
        }
        else if (HasPlayedHere("a1") && HasPlayedHere("a2") && HasPlayedHere("a3"))
        {
            _hasWon = true;
        }
        else if (HasPlayedHere("b1") && HasPlayedHere("b2") && HasPlayedHere("b3"))
        {
            _hasWon = true;
        }
        else if (HasPlayedHere("c1") && HasPlayedHere("c2") && HasPlayedHere("c3"))
        {
            _hasWon = true;
        }
        else if (HasPlayedHere("a1") && HasPlayedHere("b2") && HasPlayedHere("c3"))
        {
            _hasWon = true;
        }
        else if (HasPlayedHere("c1") && HasPlayedHere("b2") && HasPlayedHere("a3"))
        {
            _hasWon = true;
        }
        else
        {
            _hasWon = false;
        }
        return _hasWon;
    }
}
