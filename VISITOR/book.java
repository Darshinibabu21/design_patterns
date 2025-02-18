package VISITOR;

public class book implements itemelement{
    private String isbn;
    private int price;
    public book(String isbn,int price)
    {
        this.isbn=isbn;
        this.price=price;
    }

    public String getisbn()
    {
        return isbn;
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
