package FACTORY_METHOD;

public class wordfactory extends documentfactory{
    public  document createdoc()
    {
        return new worddoc();
    }
}
