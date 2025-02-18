package PROXY;

public class realimage implements image{
    private String filename;
    public realimage(String filename)
    {
        this.filename=filename;
        loadimagefromdisk();
    }
    private void loadimagefromdisk()
    {
       System.out.println("loading image " + filename);
    }
    public void display()
    {
       System.out.println("displaying image " + filename);
    }
}
