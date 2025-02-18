package TEMPLATEMETHOD;

abstract class beveragetemplate {
    public final void prepare()
    {
        boil();
        brew();
        pourincup();
        if(addcondiments())
        {
            addtoppings();
        }
        System.out.println("beverage is ready");
    }

    public void boil()
    {
        System.out.println("boiling the water..");

    }

    public void pourincup()
    {
        System.out.println("pouring in the cup..");

    }

    public boolean addcondiments()
    {
        return true;
    }

    protected abstract void brew();
    protected abstract void addtoppings();

}
