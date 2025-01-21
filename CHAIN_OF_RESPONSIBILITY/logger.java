abstract class logger {
    protected logger next;
    public void setlogger(logger next)
    {
        this.next=next;
    }
    public void message(String msg, loglevel level)
    {
        if(canhandle(level))
        {
            write(msg);
        }
        else if(next!=null)
        {
            next.message(msg,level);
        }
    }

    protected abstract boolean canhandle(loglevel level);
    
    protected abstract void write(String msg);
}

enum loglevel{
    INFO,DEBUG,ERROR;
}
