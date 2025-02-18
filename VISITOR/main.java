package VISITOR;

public class main {
    public static void main(String[] args) {
        itemelement items[]=new itemelement[]{
            new book("123",250),
            new book("444",100),
            new electronics("sony",600),
            new electronics("samsung", 450)
        };
        shoppingcartvisitor sc=new shoppingcartimp();
        int total=0;
        for(itemelement item:items)
        {
            total+=item.accept(sc);   
        }
        System.out.println("total cost: " + total);
    }
}
