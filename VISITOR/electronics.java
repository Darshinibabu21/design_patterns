package VISITOR;

public class electronics implements itemelement{
    private String brand;
    private int price;
    public electronics(String brand,int price)
    {
        this.brand=brand;
        this.price=price;
    }

    public String getbrand()
    {
        return brand;
    }

    public int getprice()
    {
        return price;
    }

    public int accept(shoppingcartvisitor visitor)
    {
        return visitor.visit(this);
    }
}
