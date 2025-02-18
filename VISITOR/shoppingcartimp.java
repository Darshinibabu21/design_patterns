package VISITOR;

public class shoppingcartimp implements shoppingcartvisitor{
    public int visit(book b)
    {
        int cost=b.getprice();
        if(cost>200)
        {
            cost-=50;
        }
        System.out.println("book: " + b.getisbn() + " price: " + cost);
        return cost;
    }

    public int visit(electronics e)
    {
        int cost=e.getprice();
        if(cost>500)
        {
            cost-=100;
        }
        System.out.println("electronics brand: " + e.getbrand() + " price: " + cost);
        return cost;
    }
}
