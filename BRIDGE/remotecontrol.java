package BRIDGE;

abstract class remotecontrol {
    protected device d;
    public remotecontrol(device d)
    {
        this.d=d;
    }
    public void turnon()
    {
        d.turnon();
    }

    public void turnoff()
    {
        d.turnoff();
    }

    public void setvolume(int volume)
    {
        d.setvolume(volume);
    }

}
