package PROTOTYPE;

public class car implements vehicleprototype{
    private String engine;
    private String model;
    private int seats;
    public car(String engine,String model,int seats)
    {
        this.engine=engine;
        this.model=model;
        this.seats=seats;
    }

    public car(car c)
    {
        this.engine=c.engine;
        this.model=c.model;
        this.seats=c.seats;
    }
    public vehicleprototype clone()
    {
        return new car(this);
    }
    public void showdetails()
    {
        System.out.println("Car engine: "+engine);
        System.out.println("Car model: "+model);
        System.out.println("Car seats: "+seats);

    }
}
