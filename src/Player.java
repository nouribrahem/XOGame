import java.util.Scanner;
public class Player
{
    private String name;
    private char symbol;

    Player(String name, char symbol)
    {
        this.name = name;
        this.symbol = symbol;
    }

    public int getX()
    {
        System.out.println("enter move position: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        return x;
    }

    public int getY()
    {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        return y;
    }
    



}
