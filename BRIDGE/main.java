package BRIDGE;

public class main {
    public static void main(String[] args) {
        device t=new tv();
        device r=new radio();

        System.out.println("Using Basic Remote with TV:");
        remotecontrol b=new basicremote(t);
        b.turnon();
        b.setvolume(20);
        b.turnoff();

        System.out.println("Using Basic Remote with Radio:");
        advancedremote a=new advancedremote(r);
        a.turnon();
        a.setvolume(15);
        a.increasevol();
        a.decreasevol();
        a.turnoff();
    }
}
