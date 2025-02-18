package ABSTRACTFACTORY;

public class windowsfactory implements GUIfactory{
    public button createbutton()
    {
        return new windowsbutton();
    }
    public checkbox createcheckbox()
    {
        return new windowscheckbox();
    }
}
