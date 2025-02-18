package COMPOSITE;
import java.util.ArrayList;
import java.util.List;

public class manager implements employee{
    private String name;
    private String dept;
    private List<employee> emp=new ArrayList<>();

    public manager(String name,String dept)
    {
        this.name=name;
        this.dept=dept;
    }

    public void addemployee(employee e)
    {
        emp.add(e);
    }

    public void removeemployee(employee e)
    {
        emp.remove(e);
    }

    public void show()
    {
        System.out.println("manager: "+ name + " department: " + dept);
        System.out.println("employee details..");
        for(employee e:emp)
        {
           e.show();
        }
    }
}
