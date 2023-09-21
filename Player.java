import java.util.ArrayList;

public class Player {
    private static char _playerSymbol;
    private static Boolean _hasWon;
    private static ArrayList<String> _addressesPlayedByPlayer = new ArrayList<>();

    public Player(char playerSymbol)
    {
        _playerSymbol = playerSymbol;
        _hasWon = false;
    }

    public static char GetPlayerSymbol()
    {
        return _playerSymbol;
    }

    public void MakePlay(BoardAddress address)
    {
        address.ChangeAddressValuesWhenPlayed(_playerSymbol);
        _addressesPlayedByPlayer.add(address.GetID());
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
