class Vehicle {
    private final String make;
    private final String model;
    private final int year;
    private final double rentalPricePerDay;

    public Vehicle(String make, String model, int year, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    //getter for make
    public String getMake() {
        return make;
    }

    //getter  for model
    public String getModel() {
        return model;
    }

    //Getter for year
    public int getYear() {
        return year;
    }

    //getter  for RentalPricePerDay
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public double calculatedRentalCost(int days) {
        return rentalPricePerDay * days;
    }
}

//class car
class Car extends Vehicle {
    private final int numSeats;
    private final int numDoors;

    public Car(String make, String model, int year, double rentalPricePerDay, int numSeats, int numDoors) {
        super(make, model, year, rentalPricePerDay);
        this.numSeats = numSeats;
        this.numDoors = numDoors;
    }

    //gettter for numseats
    public int getNumSeats() {
        return numSeats;
    }

    //getter for numdoors
    public int getNumDoors() {
        return numDoors;
    }
}

//class Motorcycles
class Motorcycle extends Vehicle {
    private final int engineSize;

    public Motorcycle(String make, String model, int year, double rentalPricePerDay, int engineSize) {
        super(make, model, year, rentalPricePerDay);
        this.engineSize = engineSize;
    }

    //getter for enginesize
    public int getEngineSize() {
        return engineSize;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car("Honda", "City", 2023, 50.0, 5, 4);
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 2020, 30, 1000);

        //calculate rental cost
        int rentalDays = 4;
        double carRentalCosts = car.calculatedRentalCost(rentalDays);
        double motorcycleRentalCost = motorcycle.calculatedRentalCost(rentalDays);

        System.out.println("car Details : ");
        System.out.println("Make : " + car.getMake());
        System.out.println("Model : " + car.getModel());
        System.out.println("Year : " + car.getYear());
        System.out.println("Seats : " + car.getNumSeats());
        System.out.println("Doors : " + car.getNumDoors());
        System.out.println("Rental price per day : " + car.getRentalPricePerDay());
        System.out.println("Total Rental cost in 4 days : " + carRentalCosts);

        System.out.println();
        System.out.println("Motorcycle Details");
        System.out.println("Make : " + motorcycle.getMake());
        System.out.println("Model : " + motorcycle.getModel());
        System.out.println("Year : " + motorcycle.getYear());
        System.out.println("Engine Size: " + motorcycle.getEngineSize() + "cc");
        System.out.println("Rental price per day : " + motorcycle.getRentalPricePerDay());
        System.out.println("Total Rental cost in 4 days : " + motorcycleRentalCost);
    }
}
