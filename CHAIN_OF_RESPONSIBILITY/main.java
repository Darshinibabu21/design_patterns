public class main {
    public static void main(String args[])
    {
        logger inf=new info();
        logger deb=new debug();
        logger err=new error();
        
        inf.setlogger(deb);
        deb.setlogger(err);

        inf.message("the info message ",loglevel.INFO);
        inf.message("the debug message ",loglevel.DEBUG);
        inf.message("the error message ",loglevel.ERROR);
    }
}
