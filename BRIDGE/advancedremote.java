package BRIDGE;

public class advancedremote extends remotecontrol{
    public advancedremote(device d)
    {
        super(d);
    }
    public void increasevol()
    {
        int curr=d.getvolume();
        d.setvolume(curr+10);
        System.out.println("increasing the volume :" + d.getvolume());
       
    }
    public void decreasevol()
    {
        int curr=d.getvolume();
        d.setvolume(curr-10);
        System.out.println("decreasing the volume :" + d.getvolume());
       
    }
}
