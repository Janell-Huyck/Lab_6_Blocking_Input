import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        double cost = 0.0;
        double tank_range = 0.0;
        Scanner in = new Scanner(System.in);
        double tank_capacity = 0;
        double fuel_efficiency = 0;
        double fuel_cost = 0;
        String trash = "";
        boolean valid_input = false;

        do {
            System.out.print("Enter the tank capacity in gallons: ");
            if (in.hasNextDouble()) {
                tank_capacity = in.nextDouble();
                if (tank_capacity <= 0) {
                    System.out.println(tank_capacity + " is not a valid tank size. Tank capacity must be greater than zero.");
                    in.nextLine();
                } else {
                    valid_input = true;
                    in.nextLine();
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. " + trash + " is not a valid tank size.");
            }
        } while (!valid_input);

        valid_input = false;
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuel_efficiency = in.nextDouble();
                if (fuel_efficiency <= 0) {
                    System.out.println(fuel_efficiency + " is an invalid efficiency. Fuel efficiency must be greater than zero.");
                } else {
                    valid_input = true;
                    in.nextLine();
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. " + trash + " is not a valid fuel efficiency.");
            }
        } while (!valid_input);

        valid_input = false;
        do {
            System.out.print("Enter the price per gallon of fuel: ");
            if (in.hasNextDouble()) {
                fuel_cost = in.nextDouble();
                if (fuel_cost <= 0) {
                    System.out.println("Invalid input. Fuel cost must be greater than zero.");
                } else {
                    valid_input = true;
                    in.nextLine();
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. " + trash + " is not a valid fuel cost.");
            }
        } while (!valid_input);

        // calculate the cost to drive 100 miles
        cost = 100 / fuel_efficiency * fuel_cost;
        System.out.println("The cost to drive 100 miles is $" + cost + ".");

        // calculate how far the car can go with a full tank of gas.
        tank_range = tank_capacity * fuel_efficiency;
        System.out.println("The car can go " + tank_range + " miles with a full tank of gas.");
    }
}
