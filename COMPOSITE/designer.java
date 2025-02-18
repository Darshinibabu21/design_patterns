package COMPOSITE;

public class designer implements employee{
    private String name;
    private String position;
    public designer(String name, String position)
    {
        this.name=name;
        this.position=position;
    }
    public void show()
    {
        System.out.println("designer name: " + name +" position:" + position);
    }
}
