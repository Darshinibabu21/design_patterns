package INTREPRETER;

public class numberexpression implements expression{
    private int number;
    public numberexpression(int number)
    {
        this.number=number;
    }
    public int intrepret()
    {
        return number;
    }
}
