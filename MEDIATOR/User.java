

abstract  class User {
    protected chatmediator mediator;
    protected String name;
    public User(chatmediator mediator,String name)
    {
        this.mediator=mediator;
        this.name=name;
    }

    public abstract void sendmessage(String message);
    public abstract void recievemessage(String message);
}
