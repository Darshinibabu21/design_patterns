public class error extends logger{
    protected boolean canhandle(loglevel level)
    {
        return level==loglevel.ERROR;
    }
    protected void write(String msg)
    {
        System.out.println("[ERROR]"+ msg);
    }

}
