package ITERATOR;

public class bookcollection implements bookcollectioninterface{
    private String[] books;
    private int size;
    public bookcollection(String[] books)
    {
        this.books=books;
        this.size=books.length;
    }
    public int getsize()
    {
        return size;
    }

    public String getbookindex(int index)
    {
        return books[index];
    }

    public iterator createiterator()
    {
        return new bookiterator(this);
    }
}
