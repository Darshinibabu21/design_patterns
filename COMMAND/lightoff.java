package COMMAND;

public class lightoff implements command{
    private light l;
    public lightoff(light l)
    {
       this.l=l;
    }

    public void execute()
    {
        l.turnoff();
    }

    public void undo()
    {
        l.turnon();
    }
}
