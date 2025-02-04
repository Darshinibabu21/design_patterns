package STATE;

public class redlight implements trafficlightstate{
    public void changelight(trafficlight context)
    {
        System.out.println("red light turning yellow");
        context.setstate(new yellowlight());
    }
}
