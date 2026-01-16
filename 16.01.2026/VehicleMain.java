class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee = 1500;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("----------------------");
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul", "Bike");
        Vehicle v2 = new Vehicle("Aman", "Car");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(2000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
