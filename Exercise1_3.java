import java.util.Scanner;

public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double area = 3.14 * Math.pow(radius, 2);

        System.out.println("Area of the circle = " + area);

        input.close();
    }
}