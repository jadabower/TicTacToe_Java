public class GameBoard {
    // private versions of the board addresses
    private BoardAddress _a1;
    private BoardAddress _b1;
    private BoardAddress _c1;
    private BoardAddress _a2;
    private BoardAddress _b2;
    private BoardAddress _c2;
    private BoardAddress _a3;
    private BoardAddress _b3;
    private BoardAddress _c3;
    // list of all of the addresses
    private BoardAddress[] _addresses = new BoardAddress[9];
    
    // constructor
    public GameBoard()
    {
        _a1 = new BoardAddress("a1");
        _b1 = new BoardAddress("b1");
        _c1 = new BoardAddress("c1");
        _a2 = new BoardAddress("a2");
        _b2 = new BoardAddress("b2");
        _c2 = new BoardAddress("c2");
        _a3 = new BoardAddress("a3");
        _b3 = new BoardAddress("b3");
        _c3 = new BoardAddress("c3");
        _addresses[0] = _a1;
        _addresses[1] = _b1;
        _addresses[2] = _c1;
        _addresses[3] = _a2;
        _addresses[4] = _b2;
        _addresses[5] = _c2;
        _addresses[6] = _a3;
        _addresses[7] = _b3;
        _addresses[8] = _c3;
    }

    // prints the game board to the screen with the current shown values of each of the addresses
    public void PrintCurrentGameBoard()
    {
        System.out.println();
        System.out.println("  A   B   C  ");
        System.out.println("1" + " " + _a1.GetShownValue() + " | " + _b1.GetShownValue() + " | " + _c1.GetShownValue() + " ");
        System.out.println(" ---+---+--- ");
        System.out.println("2" + " " + _a2.GetShownValue() + " | " + _b2.GetShownValue() + " | " + _c2.GetShownValue() + " ");
        System.out.println(" ---+---+--- ");
        System.out.println("3" + " " + _a3.GetShownValue() + " | " + _b3.GetShownValue() + " | " + _c3.GetShownValue() + " ");
        System.out.println();
    }

    // takes in an id and returns the address with that id
    public BoardAddress GetBoardAddressFromID(String id)
    {
        for (BoardAddress address : _addresses) 
        {
            if (address.GetID().equals(id))
            {
                return address;
            }
        }
        return null;
    }

    // changes the shown value of an address from an id and for a specific player
    public void ChangeShownFromID(String id, String color, char playerSymbol)
    {
        BoardAddress address = GetBoardAddressFromID(id);
        address.ChangeShown(playerSymbol, color);
    }

    // checks if a given id is related to a valid address
    public Boolean GetIfAddressIsValid(String id)
    {
        for (BoardAddress boardAddress : _addresses) 
        {
            if (boardAddress.GetID().equals(id))
            {
                return true;
            }
        }
        return false;
    }
}
