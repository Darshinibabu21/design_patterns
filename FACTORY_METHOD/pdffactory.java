package FACTORY_METHOD;

public class pdffactory extends documentfactory{
    public  document createdoc()
    {
        return new pdfdoc();
    }
}
