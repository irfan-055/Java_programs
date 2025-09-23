import java.util.Scanner;


abstract class Ride {
    
    abstract int calculateFare(int distance);

    
    void rideType() {
        System.out.println("Generic Ride");
    }
}


class AutoRide extends Ride {
    @Override
    int calculateFare(int distance) {
        return distance * 10;
    }

    @Override
    void rideType() {
        System.out.println("Auto Ride");
    }
}


class CarRide extends Ride {
    @Override
    int calculateFare(int distance) {
        return distance * 20;
    }

    @Override
    void rideType() {
        System.out.println("Car Ride");
    }
}


public class booking_app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter ride type (auto/car): ");
        String type = scanner.nextLine().trim().toLowerCase();

       
        System.out.print("Enter distance in kilometers: ");
        int distance = scanner.nextInt();

        Ride ride;

        
        if (type.equals("auto")) {
            ride = new AutoRide();
        } else if (type.equals("car")) {
            ride = new CarRide();
        } else {
            System.out.println("Invalid ride type.");
            scanner.close();
            return;
        }

        
        ride.rideType();
        int fare = ride.calculateFare(distance);
        System.out.println("Total Fare: ₹" + fare);

        scanner.close();
    }
}
