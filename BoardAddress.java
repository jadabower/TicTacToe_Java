public class BoardAddress {
    // String to identify which address it is
    private String _id;
    // String to represent the char shown and the color of that char
    private String _shownValue;
    // bool to make sure it doesn't get played twice
    private Boolean _isPlayed;

    // String to change the following printed statements back to default
    static String resetColor = "\u001B[0m";

    // constructor
    public BoardAddress(String id)
    {
        _shownValue = " ";
        _isPlayed = false;
        _id = id;
    }

    // gets the id
    public String GetID()
    {
        return _id;
    }

    // gets the shown value
    public String GetShownValue()
    {
        return _shownValue;
    }

    // gets whether the address is played on
    public Boolean GetIsPlayed()
    {
        return _isPlayed;
    }

    // changes the shown value
    public void ChangeShown(char playerSymbol, String playerColor)
    {
        _shownValue = playerColor + playerSymbol + resetColor;
    }

    // changes the shown value and sets _isPlayed to true
    public void ChangeAddressValuesWhenPlayed(char playerSymbol, String playerColor)
    {
        ChangeShown(playerSymbol, playerColor);
        _isPlayed = true;
    }
}
