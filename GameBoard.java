// import java.util.ArrayList;
// import java.util.List;

public class GameBoard {
    private BoardAddress _a1;
    private BoardAddress _b1;
    private BoardAddress _c1;
    private BoardAddress _a2;
    private BoardAddress _b2;
    private BoardAddress _c2;
    private BoardAddress _a3;
    private BoardAddress _b3;
    private BoardAddress _c3;
    private BoardAddress[] _addresses = new BoardAddress[9];
    
    public GameBoard(BoardAddress a1, BoardAddress b1, BoardAddress c1, BoardAddress a2, BoardAddress b2, BoardAddress c2, BoardAddress a3, BoardAddress b3, BoardAddress c3)
    {
        _a1 = a1;
        _b1 = b1;
        _c1 = c1;
        _a2 = a2;
        _b2 = b2;
        _c2 = c2;
        _a3 = a3;
        _b3 = b3;
        _c3 = c3;
        _addresses[0] = a1;
        _addresses[1] = b1;
        _addresses[2] = c1;
        _addresses[3] = a2;
        _addresses[4] = b2;
        _addresses[5] = c2;
        _addresses[6] = a3;
        _addresses[7] = b3;
        _addresses[8] = c3;
    }

    public void PrintCurrentGameBoard()
    {
        System.out.println("  A   B   C  ");
        System.out.println("1" + " " + _a1.GetShownValue() + " | " + _b1.GetShownValue() + " | " + _c1.GetShownValue() + " ");
        System.out.println(" ---+---+--- ");
        System.out.println("2" + " " + _a2.GetShownValue() + " | " + _b2.GetShownValue() + " | " + _c2.GetShownValue() + " ");
        System.out.println(" ---+---+--- ");
        System.out.println("3" + " " + _a3.GetShownValue() + " | " + _b3.GetShownValue() + " | " + _c3.GetShownValue() + " ");
    }

    public BoardAddress GetBoardAddressFromID(String id)
    {
        for (BoardAddress address : _addresses) 
        {
            if (address.GetID() == id)
            {
                return address;
            }
        }
        return null;
    }
}
