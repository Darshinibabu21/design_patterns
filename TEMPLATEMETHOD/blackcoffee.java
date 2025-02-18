package TEMPLATEMETHOD;

public class blackcoffee extends beveragetemplate{
    public void brew()
    {
        System.out.println("dripping black coffee");
    }

    public void addtoppings()
    {
        System.out.println("no topping needed");
    }

    public boolean addcondiments()
    {
        return false;
    }
}
