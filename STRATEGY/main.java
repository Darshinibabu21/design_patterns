package STRATEGY;

public class main {
    public static void main(String[] args) {
        paymentcontext p=new paymentcontext();
        p.setpayment(new creditcardpayment("123-145-777"));
        p.executepayment(100);

        p.setpayment(new googlepaypayment("1234567890"));
        p.executepayment(200);

        p.setpayment(new paypalpayment("abc2gmail.com"));
        p.executepayment(300);
    
    }
}
