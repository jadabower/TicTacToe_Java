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
        if (_addressesPlayedByPlayer.contains("a1") && _addressesPlayedByPlayer.contains("b1") && _addressesPlayedByPlayer.contains("c1"))
        {
            _hasWon = true;
        } 
        else if (_addressesPlayedByPlayer.contains("a2") && _addressesPlayedByPlayer.contains("b2") && _addressesPlayedByPlayer.contains("c2"))
        {
            _hasWon = true;
        } 
        else if (_addressesPlayedByPlayer.contains("a3") && _addressesPlayedByPlayer.contains("b3") && _addressesPlayedByPlayer.contains("c3"))
        {
            _hasWon = true;
        }
        else if (_addressesPlayedByPlayer.contains("a1") && _addressesPlayedByPlayer.contains("a2") && _addressesPlayedByPlayer.contains("a3"))
        {
            _hasWon = true;
        }
        else if (_addressesPlayedByPlayer.contains("b1") && _addressesPlayedByPlayer.contains("b2") && _addressesPlayedByPlayer.contains("b3"))
        {
            _hasWon = true;
        }
        else if (_addressesPlayedByPlayer.contains("c1") && _addressesPlayedByPlayer.contains("c2") && _addressesPlayedByPlayer.contains("c3"))
        {
            _hasWon = true;
        }
        else if (_addressesPlayedByPlayer.contains("a1") && _addressesPlayedByPlayer.contains("b2") && _addressesPlayedByPlayer.contains("c3"))
        {
            _hasWon = true;
        }
        else if (_addressesPlayedByPlayer.contains("c1") && _addressesPlayedByPlayer.contains("b2") && _addressesPlayedByPlayer.contains("a3"))
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
