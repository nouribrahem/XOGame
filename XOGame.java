import GBG.Game;
public class XOGame extends Game{
    public void run()
    {
        XOPlayer player1 = new XOPlayer();
        XOPlayer player2 = new XOPlayer();
        XOBoard b = new XOBoard();
        b.displayBoard();
        while (true)
        {
            while (!(b.updateBoard(player1.getMove(), player1.getSymbol())))
            {
                continue;
            }
            b.displayBoard();
            if(b.isWinner())
            {
                System.out.println("player " + player1.getName() + " is winner!");
                return;
            }
            if(b.isDraw())
            {
                System.out.println("it's a draw!");
                return;
            }

            while (!(b.updateBoard(player2.getMove(), player2.getSymbol())))
            {
                continue;
            }
            b.displayBoard();
            if(b.isWinner())
            {
                System.out.println("player " + player2.getName() + " is winner!");
                return;
            }
            

        }

    }
}
