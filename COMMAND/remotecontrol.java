package COMMAND;

public class remotecontrol {
    private command c;
    public void setcommand(command c)
    {
        this.c=c;
    }
    public void pressbutton()
    {
        c.execute();
    }
    public void pressundo()
    {
        c.undo();
    }
}
