package BRIDGE;

public class tv implements device{
    private int volume;
    public void turnon()
    {
        System.out.println("tv is turning on");
    }
    public void turnoff()
    {
        System.out.println("tv is turning off");
    }
    public void setvolume(int volume)
    {
        this.volume=volume;
        System.out.println("tv volume is set to " + volume);
    }
    public int getvolume()
    {
        return volume;
    }
}
