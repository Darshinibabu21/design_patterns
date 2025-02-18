package ABSTRACTFACTORY;

public class macfactory implements GUIfactory{
    public button createbutton()
    {
        return new macbutton();
    }
    public checkbox createcheckbox()
    {
        return new maccheckbox();
    }
}
