public class main{
    public static void main(String args[])
    {
        singleton a=singleton.getinstance();
        singleton b=singleton.getinstance();
        a.show();
    }
}