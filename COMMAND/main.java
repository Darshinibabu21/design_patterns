package COMMAND;

public class main {
    public static void main(String[] args) {
        light ll=new light();
        command lon=new lighton(ll);
        command loff=new lightoff(ll);

        remotecontrol r=new remotecontrol();
        r.setcommand(lon);
        r.pressbutton();
        r.pressundo();

        r.setcommand(loff);
        r.pressbutton();
        r.pressundo();
    }
}
