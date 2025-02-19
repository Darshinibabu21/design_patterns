package BUILDER;

public class car {
    private String engine;
    private int seats;
    private boolean hasgps;
    private boolean hasac;

    car(carbuilder builder)
    {
        this.engine=builder.engine;
        this.seats=builder.seats;
        this.hasgps=builder.hasgps;
        this.hasac=builder.hasac;

    }

    public void showdetails()
    {
        System.out.println("Engine: " + engine);
        System.out.println("Seats: " + seats);
        System.out.println("GPS: " + (hasgps?"yes":"no"));
        System.out.println("Air conditioning: " + (hasac?"yes":"no"));
    }

    public static class carbuilder {
        private String engine;
        private int seats;
        private boolean hasgps;
        private boolean hasac;
    
        public carbuilder setengine(String engine)
        {
            this.engine=engine;
            return this;
        }
        public carbuilder setseats(int seats)
        {
            this.seats=seats;
            return this;
        }
        public carbuilder setgps(boolean hasgps)
        {
            this.hasgps=hasgps;
            return this;
        }
        public carbuilder setac(boolean hasac)
        {
            this.hasac=hasac;
            return this;
        }
    
        public car build()
        {
            return new car(this);
        }
    }
    
}
