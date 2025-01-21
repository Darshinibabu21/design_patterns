public class info extends logger {
    protected boolean canhandle(loglevel level)
    {
        return level==loglevel.INFO;
    }
    protected void write(String msg)
    {
        System.out.println("[INFO]"+ msg);
    }

}
