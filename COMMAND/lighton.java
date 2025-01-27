package COMMAND;

public class lighton implements command{
    private light l;
    public lighton(light l)
    {
       this.l=l;
    }

    public void execute()
    {
        l.turnon();
    }

    public void undo()
    {
        l.turnoff();
    }
}
