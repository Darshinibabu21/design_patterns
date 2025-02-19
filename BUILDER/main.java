package BUILDER;

public class main {
    public static void main(String[] args) {
        car sportsCar = new car.carbuilder()
                .setengine("V8 Turbo")
                .setseats(2)
                .setgps(true)
                .setac(true)
                .build();

        sportsCar.showdetails();

    }
}
