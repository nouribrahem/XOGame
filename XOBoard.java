import GBG.Board;

public class XOBoard extends Board {
    
    XOBoard()
    {
        this.dimension = 3;
        setDimension(dimension);
    }
    public boolean isWinner()
    {
        for (int i = 0; i < dimension; i++)
        {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] &&  board[i][1] != '-')
            {
                return true;
            }
        }
        for (int i = 0; i < dimension; i++)
        {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] &&  board[1][i] != '-')
            {
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] &&  board[1][1] != '-')
        {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] &&  board[1][1] != '-')
        {
            return true;
        }
        return false;
    }
}
