package GBG;

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
        char count = '1';
        for(int i = 0 ; i < dimension; i++)
        {
            for(int j = 0 ; j < dimension; j++)
            {
                board[i][j] = count++;
            }
        }
    }

    public void displayBoard()
    {
        for(int i = 0; i < dimension; i++)
        {
            for(int j = 0; j < dimension; j++)
            {
                System.out.print(" | " + board[i][j]  + " | ");
            }
            System.out.println('\n');
        }
    }

    public boolean updateBoard(int x, char symbol)
    {
        if (x >= 1 && x <= dimension * dimension)
        {
            for(int i = 0; i < dimension; i++)
            {
                for(int j = 0; j < dimension; j++)
                {
                    if(board[i][j] == (char)(x + '0'))
                    {
                        board[i][j] = symbol;
                        countMoves++;
                        return true;
                    }
                }
            }

        }
        return false;
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
