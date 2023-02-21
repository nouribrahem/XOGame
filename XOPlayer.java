import GBG.Player;
import java.util.Scanner;
public class XOPlayer extends Player{
    XOPlayer()
    {
        System.out.println("enter your first name and symbol: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        char symbol = in.next().charAt(0);
        this.name = name;
        this.symbol = symbol;
    }
    
}