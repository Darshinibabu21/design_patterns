public class singleton
{
    private static singleton instance;

    private singleton(){

    }
    public static singleton getinstance()
    {
        if(instance==null)
        {
          instance=new singleton();
        }
        return instance;
    }
    public void show()
    {
        System.out.println("singleton instance is created");
    } 
}