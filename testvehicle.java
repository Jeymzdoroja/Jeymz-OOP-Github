// James Harrey G. Doroja


import java.util.Scanner;

// Base Class Vehicle
class Vehicle {
    private String brand;
    private double speed;
    private String fuelType;

    // Constructor
    public Vehicle (String brand, double speed, String fuelType){
        this. brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;    
    }
    // Encapsulation: Getter and Setter Methods
    public String getBrand() {
        return brand;
    }
    public void setBrand(String Brand, String brand) {
        this.brand = brand;
    }
    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public String getFuelType(){
        return fuelType;
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    // Method to deposit Money
    public void displayVehicleinfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed (km/h): " + speed + "km/h");
        System.out.println("Fuel Type: " + fuelType);
    }

    // Car Subclass
    class car extends Vehicle{
        private int numDoors;

    // Constructor
    public car(String brand, double speed, String fuelType, int numDoors) {
        super(brand,speed,fuelType);
        this.numDoors = numDoors;
    }

    //Encapsulation: Getter and Setter
    public int getNumDoors(){
        return numDoors;
    }
    public void setnumDoors(int numDoors){
        this.numDoors = numDoors;
    }
    // Method to displayu car
    @Override
    public void displayVehicleinfo(){
        super.displayVehicleinfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}
//Motorcycle Sublcass
class motorcycle extends Vehicle{
    private boolean hasSidecar;

    //Constructor
    public motorcycle (String brand, double speed, String fuelType, boolean hasSidecar){
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }
 // Encapsulation
 public boolean gethasSidecar(){
    return hasSidecar;
     }
     public void sethasSidecar(boolean hasSidecar){
     this.hasSidecar = hasSidecar;
     }


    // Method to display motorcycle details
    @Override
    public void displayVehicleinfo(){
        super.displayVehicleinfo();
        System.out.println("Has sidecar " + (hasSidecar ? "Yes" : "No"));
    }
}
//Implement the TestVehicle Class (Main Method)
public static void main(String [] args){
    Scanner jeymz = new Scanner(System.in);

    //ENter Car details
    System.out.println("Enter Car Details: ");
    System.out.print("Brand: ");
    String carBrand = jeymz.nextLine();
    System.out.print("Speed (km/h): ");
    double carSpeed = jeymz.nextDouble();
    System.out.print("Fuel Type: ");
    String carFuelType = jeymz.next();
    System.out.print("Number of Doors: ");
    int carNumDoors = jeymz.nextInt();

    //Enter Motorcycle Info
    System.out.println("\nENter Motorcycle Info: ");
    System.out.print("Brand: ");
    String motorcycleBrand = jeymz.next();
    System.out.print ("Speed (km/h): ");
    double motorcycleSpeed = jeymz.nextDouble();
    System.out.print("Fuel Type: ");
    String motorcycleFuelType = jeymz.next();
    System.out.print("Has sidecar (true/false): ");
    boolean motorcycleHasSidecar = jeymz.nextBoolean();

    //Create car and motorcycle
    Vehicle.car car = new Vehicle(motorcycleFuelType, motorcycleSpeed, motorcycleFuelType).new car(carBrand, carSpeed, carFuelType, carNumDoors);
    Vehicle.motorcycle motorcycle = new Vehicle(motorcycleFuelType, motorcycleSpeed, motorcycleFuelType).new motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuelType, motorcycleHasSidecar);

    //Display Car adn motorcycle info
    System.out.println("\nCar Details");
    car.displayVehicleinfo();
    System.out.println("\nMotorcycle Details:");
    motorcycle.displayVehicleinfo();
}
}