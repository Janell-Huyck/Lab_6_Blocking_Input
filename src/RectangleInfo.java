import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        boolean valid_input = false;
        Scanner in = new Scanner(System.in);
        String trash = "";

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                valid_input = true;
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. " + trash + " is not a valid width.");
            }
        } while (!valid_input);

        valid_input = false;
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                valid_input = true;
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. " + trash + " is not a valid height.");
            }
        } while (!valid_input);

        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt(width * width + height * height);

        System.out.println("The area of the rectangle is " + area + ".");
        System.out.println("The perimeter of the rectangle is " + perimeter + ".");
        System.out.println("The diagonal of the rectangle is " + diagonal + ".");
    }
}
