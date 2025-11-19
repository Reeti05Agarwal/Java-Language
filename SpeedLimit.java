package Codes;

import java.util.Scanner;

class GenericVehicle{
    int speedLimit() {
        return 100;
    }
}

class Car extends GenericVehicle{
    @Override
    int speedLimit() {
        return 150;
    }
}

class Bike extends GenericVehicle{
    @Override
    int speedLimit() {
        return 180;
    }
}

public class SpeedLimit {
    public static void main(String[] args) {
        GenericVehicle v = new Car();
        GenericVehicle b = new Bike();
        System.out.println(v.speedLimit());
        System.out.println(b.speedLimit());
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vehicle: ");
        String vehicle = sc.nextLine();
        System.out.println("Enter the speed: ");
        int speed = Integer.parseInt(sc.nextLine());
        
        
        switch (vehicle) {
            case "Car":
                if (speed > v.speedLimit()) {
                    System.out.println("Speed limit exceeded");
                }
                else {
                    System.out.println("Speed limit not exceeded");
                }
                break;
            case "Bike":
                if (speed > b.speedLimit()) {
                    System.out.println("Speed limit exceeded");
                }
                else {
                    System.out.println("Speed limit not exceeded");
                }                
                break;
            default:
                System.out.println("Invalid vehicle");
                break;
        }

    }
}
