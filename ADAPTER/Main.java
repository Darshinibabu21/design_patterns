package ADAPTER;

public class Main{
    public static void main(String[] args) {
        thirdparty third=new thirdparty();
        payment p=new paymentadapter(third);
        p.processpayment(100.0);
    }
}
