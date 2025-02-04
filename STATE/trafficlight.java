package STATE;

public class trafficlight {
    private trafficlightstate state;
    public trafficlight()
    {
        state = new redlight();
    }

    public void setstate(trafficlightstate state)
    {
        this.state=state;
    }

    public void change()
    {
        state.changelight(this);
    }
}
