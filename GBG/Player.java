package GBG;

import java.util.Scanner;
public abstract class Player
{
    protected String name;
    protected char symbol;

    

    public int getMove()
    {
        System.out.println("enter move position: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        return x;
    }
    public char getSymbol()
    {
        return this.symbol;
    }
    public String getName()
    {
        return this.name;
    }
}
