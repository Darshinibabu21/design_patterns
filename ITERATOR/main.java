package ITERATOR;

public class main {
    public static void main(String[] args) {
        String[] books={"design patterns","refactoring","dsa"};
        bookcollection bc=new bookcollection(books);
        iterator i=bc.createiterator();
        while(i.hasnext())
        {
            System.out.println(i.next());
        }
    }
}
