package COMPOSITE;

public class developer implements employee{
    private String name;
    private String position;
    public developer(String name, String position)
    {
        this.name=name;
        this.position=position;
    }
    public void show()
    {
        System.out.println("developer name: " + name +" position:" + position);
    }
}
