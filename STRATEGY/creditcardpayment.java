package STRATEGY;

public class creditcardpayment implements paymentstrategy{
    private String cardnumber;
    public creditcardpayment(String cardnumber)
    {
        this.cardnumber=cardnumber;
    }

    public void pay(int amount)
    {
        System.out.println("paid amount " + amount + " using credit card " + cardnumber);
    }
}
