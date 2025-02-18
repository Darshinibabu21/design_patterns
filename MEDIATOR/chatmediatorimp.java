import java.util.ArrayList;
import java.util.List;

public class chatmediatorimp implements chatmediator{
    private List<User> users;
    public chatmediatorimp()
    {
        this.users=new ArrayList<>();
    } 
    public void adduser(User user)
    {
        users.add(user);
    }
    public void sendmessage(String message,User sender)
    {
        for(User user:users)
        {
            if(user!=sender){
               user.recievemessage(message);
            }
        }
    }
}
