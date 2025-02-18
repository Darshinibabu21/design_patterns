public class chatuser extends User{
    public chatuser(chatmediator mediator,String name)
    {
        super(mediator,name);
    }

    public void sendmessage(String message)
    {
        System.out.println(name +" sends: " + message);
        mediator.sendmessage(message,this );
    }
    public void recievemessage(String message)
    {
        System.out.println(name+" received: " + message);
    }
}
