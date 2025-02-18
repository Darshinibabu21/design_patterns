package TEMPLATEMETHOD;

public class main {
    public static void main(String[] args) {
        System.out.println("preparing tea");
        beveragetemplate t=new tea();
        t.prepare();

        System.out.println("preparing coffee");
        beveragetemplate c=new coffee();
        c.prepare();

        System.out.println("preparing black coffee");
        beveragetemplate bc=new blackcoffee();
        bc.prepare();
    }
}
