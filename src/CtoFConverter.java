import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit;
        String trash = "";
        boolean valid_input = false;

        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                if (celsius < -273.15) {
                    System.out.println("Invalid input. Temperature cannot be below absolute zero (-273.15).");
                    in.nextLine();
                } else {
                    valid_input = true;
                }
            } else {
                trash = in.nextLine(); // clear bad input
                System.out.println("Invalid input. " + trash + " is not a valid temperature in degrees Celsius.");
            }
        } while (!valid_input);

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
    }
}