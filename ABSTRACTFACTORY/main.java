package ABSTRACTFACTORY;

public class main {
    public static void main(String[] args) {
        GUIfactory wf=new windowsfactory();
        button b=wf.createbutton();
        checkbox c= wf.createcheckbox();

        b.render();
        c.check();

        GUIfactory mac=new macfactory();
        button b1=wf.createbutton();
        checkbox c1=wf.createcheckbox();

        b1.render();
        c1.check();
    }
}
