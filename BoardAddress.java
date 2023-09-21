public class BoardAddress {
    private static String _id;
    private static char _shownValue;
    private static Boolean _isPlayed;

    public BoardAddress(String id)
    {
        _shownValue = ' ';
        _isPlayed = false;
        _id = id;
    }

    public String GetID()
    {
        return _id;
    }

    public char GetShownValue()
    {
        return _shownValue;
    }

    public Boolean GetIsPlayed()
    {
        return _isPlayed;
    }

    public void ChangeAddressValuesWhenPlayed(char playerSymbol)
    {
        _shownValue = playerSymbol;
        _isPlayed = true;
    }
}
