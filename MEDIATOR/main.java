public class main {
    public static void main(String[] args) {
        chatmediator mediator=new chatmediatorimp();
        User user1=new chatuser(mediator, "alice");
        User user2=new chatuser(mediator, "bob");
        User user3=new chatuser(mediator, "john");
        
        mediator.adduser(user1);
        mediator.adduser(user2);
        mediator.adduser(user3);

        user1.sendmessage("hello all");
        user2.sendmessage("hello alice");
    }
}
