public abstract class textdecor implements text{
    protected text decor;
    public textdecor(text decor)
    {
        this.decor=decor;
    }
    public String style()
    {
        return decor.style();
    }
}