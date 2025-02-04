package STATE;

public class greenlight implements trafficlightstate{
    public void changelight(trafficlight context)
    {
        System.out.println("green light turning red");
        context.setstate(new redlight());
    }
}
