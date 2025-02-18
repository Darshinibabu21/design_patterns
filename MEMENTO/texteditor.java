package MEMENTO;

public class texteditor {
    private String content;
    public void setcontent(String content)
    {
        save();
        this.content=content;
    }
    public String getcontent()
    {
        return content;
    }
    public memento save()
    {
        return new memento(content);
    }
    public void restore(memento m)
    {
        if(m!=null){
        this.content=m.getstate();
        }
    }
}
