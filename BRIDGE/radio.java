package BRIDGE;

public class radio implements device{
    private int volume;
    public void turnon()
    {
        System.out.println("radio is turning on");
    }
    public void turnoff()
    {
        System.out.println("radio is turning off");
    }
    public void setvolume(int volume)
    {
        this.volume=volume;
        System.out.println("radio volume is set to " + volume);
    }
    public int getvolume()
    {
        return volume;
    }
}
