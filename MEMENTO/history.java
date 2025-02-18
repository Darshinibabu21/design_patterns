package MEMENTO;
import java.util.Stack;

public class history {
    private final Stack<memento> h=new Stack<>();
    public void savestate(memento m)
    {
        h.push(m);
    }
    public memento undo()
    {
        
        return h.isEmpty()?null:h.pop();
    }
}
