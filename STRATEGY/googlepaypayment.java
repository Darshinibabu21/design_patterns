package STRATEGY;

public class googlepaypayment implements paymentstrategy{
    private String phonenumber;
    public googlepaypayment(String phonenumber)
    {
        this.phonenumber=phonenumber;
    }

    public void pay(int amount)
    {
        System.out.println("paid amount " + amount + " using google pay " + phonenumber);
    }
}


