package STRATEGY;

public class paypalpayment implements paymentstrategy{
    private String email;
    public paypalpayment(String email)
    {
        this.email=email;
    }

    public void pay(int amount)
    {
        System.out.println("paid amount " + amount + " using paypal " + email);
    }
}
