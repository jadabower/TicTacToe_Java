public class BoardAddress {
    private String _id;
    private String _shownValue;
    private Boolean _isPlayed;

    static String resetColor = "\u001B[0m";

    public BoardAddress(String id)
    {
        _shownValue = " ";
        _isPlayed = false;
        _id = id;
    }

    public String GetID()
    {
        return _id;
    }

    public String GetShownValue()
    {
        return _shownValue;
    }

    public Boolean GetIsPlayed()
    {
        return _isPlayed;
    }

    public void ChangeShown(char playerSymbol, String playerColor)
    {
        _shownValue = playerColor + playerSymbol + resetColor;
    }

    public void ChangeAddressValuesWhenPlayed(char playerSymbol, String playerColor)
    {
        ChangeShown(playerSymbol, playerColor);
        _isPlayed = true;
    }
}
