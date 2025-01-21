public class italictext extends textdecor{
    public italictext(text decor)
    {
       super(decor);
    }
    public String style()
    {
        return "<i>" + super.style() + "</i>";
    }
}