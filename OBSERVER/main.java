package OBSERVER;

public class main {
    public static void main(String[] args) {
        stock s=new stock("apple",100.0);
        Observer obs1=new investor("alice");
        Observer obs2=new investor("bob"); 
        Observer obs3=new investor("john");
        s.addobserver(obs1);
        s.addobserver(obs2);
        s.addobserver(obs3);
        System.out.println("updating stock price..");
        s.setprice(20.0);

        s.removeobserver(obs2);
        System.out.println("updating stock price again..");
        s.setprice(44.0);
    }
}
