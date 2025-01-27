package OBSERVER;

public class investor implements Observer{
    private String name;
    public investor(String name)
    {
        this.name=name;
    }

    public void update(String stockname, double price)
    {
        System.out.println("NOTIFICATION TO: " + name +" stockname: " + stockname + " price: " + price);
    }
}
