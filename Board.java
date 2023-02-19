
import java.util.Arrays;
public abstract class Board
{
    protected int dimension;
    protected char board[][];
    protected int countMoves;

    public void setDimension(int dim)
    {
        this.dimension = dim;
        board = new char[dimension][dimension];
        countMoves = 0;
        for(int i = 0 ; i < dimension; i++)
        {
            Arrays.fill(board[i],'-');

        }
    }

    public void displayBoard()
    {
        for(int i = 0; i < dimension; i++)
        {
            for(int j = 0; j < dimension; j++)
            {
                System.out.print(board[i][j]  + " r");
            }
            System.out.println('\n');
        }
    }

    public boolean updateBoard(int x, int y, char symbol)
    {
        if (x <= dimension - 1 && x >= 0 && y <= dimension - 1 && y >= 0)
        {
            board[x][y] = symbol;
            countMoves++;
            return true;
        }
        else
        {
            return false;
        }
    }

    public abstract boolean isWinner();

    public boolean isDraw()
    {
        if (countMoves == (dimension * dimension))
        {
            return true;
        }
        return false;
    }

}
