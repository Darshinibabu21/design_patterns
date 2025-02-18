package PROXY;

public class proxyimage implements image{
    private String filename;
    private realimage real;
    public proxyimage(String filename)
    {
        this.filename=filename;
    }
    public void display()
    {
        if(real==null)
        {
            real=new realimage(filename);
        }
        real.display();
    } 
}
