package INTREPRETER;

public class additionexpression implements expression{
    private expression left;
    private expression right;

    public additionexpression(expression left,expression right)
    {
        this.left=left;
        this.right=right;
    }
    public int intrepret()
    {
        return left.intrepret() + right.intrepret();
    }
}
