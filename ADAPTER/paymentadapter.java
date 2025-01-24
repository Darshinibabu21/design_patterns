package ADAPTER;

public class paymentadapter implements payment{
    private thirdparty pay;
    public paymentadapter(thirdparty pay)
    {
        this.pay=pay;
    }

    public void processpayment(double amount)
    {
        pay.makepayment(amount);
    }
}
