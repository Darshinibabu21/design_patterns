public class boldtext extends textdecor{
    public boldtext(text decor)
    {
        super(decor);
    }
    public String style()
    {
        return "<b>" + super.style() + "</b>";
    }
}
