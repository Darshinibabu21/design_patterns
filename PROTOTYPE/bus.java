package PROTOTYPE;

public class bus implements vehicleprototype{
    private String model;
    private int cc;

    public bus(String model,int cc)
    {
       this.model=model;
       this.cc=cc;
    }
    public bus(bus b)
    {
        this.model=b.model;
        this.cc=b.cc;
    }
    public vehicleprototype clone()
    {
        return new bus(this);
    }

    public void showdetails()
    {
        System.out.println("Bus model: " +model);
        System.out.println("Bus cc: " +cc);

    }

}
