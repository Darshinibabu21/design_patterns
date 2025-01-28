package BRIDGE;

public class basicremote extends remotecontrol{
    public basicremote(device d)
    {
        super(d);
    }
    public void mute()
    {
        System.out.println("muting the device");
        d.setvolume(0);
    }
}
