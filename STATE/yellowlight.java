package STATE;

public class yellowlight implements trafficlightstate{
    public void changelight(trafficlight context)
    {
        System.out.println("yellow light turning green");
        context.setstate(new greenlight());
    }
}
