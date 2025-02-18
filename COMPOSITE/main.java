package COMPOSITE;

public class main {
    public static void main(String[] args) {
        employee dev1=new developer("alice","backend developer");
        employee dev2=new developer("john","frontend developer");
        employee des=new designer("ram","ui designer");

        manager tech=new manager("bala","tech department");
        tech.addemployee(dev1);
        tech.addemployee(dev2);
        tech.addemployee(des);

        tech.removeemployee(dev2);

        tech.show();
    }
}
