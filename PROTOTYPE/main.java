package PROTOTYPE;

public class main {
    public static void main(String[] args) {
        car car1 = new car("Tesla Model S", "Electric", 5);
        bus bus1 = new bus("Yamaha R1", 1000);
        car car2=(car)car1.clone();
        bus bus2=(bus)bus1.clone();

        car2.showdetails();
        bus2.showdetails();
    }
}
