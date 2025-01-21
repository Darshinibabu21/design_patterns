public class debug extends logger{
    protected boolean canhandle(loglevel level)
    {
        return level==loglevel.DEBUG;
    }
    protected void write(String msg)
    {
        System.out.println("[DEBUG]"+ msg);
    }

}
