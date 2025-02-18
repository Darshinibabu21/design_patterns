package PROXY;

public class main {
    public static void main(String[] args) {
        image i1=new proxyimage("photo1.jpg");
        image i2=new proxyimage("photo2.jpg");

        i1.display();
        System.out.println("");
        i1.display();

    }
}
