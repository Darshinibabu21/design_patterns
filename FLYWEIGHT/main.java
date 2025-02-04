package FLYWEIGHT;

public class main {
    public static void main(String[] args) {
        textcharacter c1=characterfactory.getchar('A');
        textcharacter c2=characterfactory.getchar('B');
        textcharacter c3=characterfactory.getchar('B');

        c1.display("red",20,"calibri");
        c2.display("blue",15,"italic");
        c3.display("black",21,"ariel");
    }
}
