package STRATEGY;

public class paymentcontext {
    private paymentstrategy payment;
    public void setpayment(paymentstrategy payment)
    {
        this.payment=payment;
    }
    public void executepayment(int amount)
    {
        if(payment != null)
        {
           payment.pay(amount);
        }
        else{
            System.out.println("No payment strategy selected");
        }
    }
}
