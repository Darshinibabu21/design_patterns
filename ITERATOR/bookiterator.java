package ITERATOR;

public class bookiterator implements iterator{
    private bookcollection books;
    private int index;
    public bookiterator(bookcollection books)
    {
        this.books=books;
        this.index=0;
    }

    public boolean hasnext()
    {
        return index < books.getsize();
    }

    public Object next()
    {
        return books.getbookindex(index++);
    }
}
