package OBSERVER;
import java.util.ArrayList;
import java.util.List;

public class stock implements subject{
    private String stockname;
    private double price;
    private List<Observer> observers;
    public stock(String stockname, double price)
    {
        this.stockname=stockname;
        this.price=price;
        this.observers = new ArrayList<>();
    }

    public void setprice(double price)
    {
        this.price=price;
        notifyobserver();
    }

    public double getprice()
    {
        return price;
    }

    public void addobserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeobserver(Observer observer)
    {
        observers.remove(observer);
    }

    public void notifyobserver()
    {
        for(Observer observer: observers)
        {
            observer.update(stockname,price);
        }
    }
}
