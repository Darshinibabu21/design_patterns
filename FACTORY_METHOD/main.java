package FACTORY_METHOD;

public class main {
    public static void main(String[] args) {
        documentfactory factory=new pdffactory();
        document d=factory.createdoc();
        d.open();
        documentfactory f=new wordfactory();
        document d2=f.createdoc();
        d2.open();
    }
}
