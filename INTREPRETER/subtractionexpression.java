package INTREPRETER;

public class subtractionexpression implements expression{
    private expression left;
    private expression right;

    public subtractionexpression(expression left,expression right)
    {
        this.left=left;
        this.right=right;
    }
    public int intrepret()
    {
        return left.intrepret() - right.intrepret();
    }
}
