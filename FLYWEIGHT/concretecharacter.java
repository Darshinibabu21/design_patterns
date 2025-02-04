package FLYWEIGHT;

public class concretecharacter implements textcharacter{
    private char symbol;
    public concretecharacter(char symbol)
    {
        this.symbol=symbol;
    }
    public void display(String color,int size,String font)
    {
        System.out.println("character: " + symbol +" color: " + color + " size: " + size + " font: " + font);
    }
}
