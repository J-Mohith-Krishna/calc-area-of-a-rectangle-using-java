import java.util.Scanner;

public class RectangleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate area
        double area = calculateRectangleArea(length, width);

        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }

    // Method to calculate the area of a rectangle
    private static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}
