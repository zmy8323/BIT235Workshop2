import java.util.Scanner;

public class Exercise1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int difference = num1 - num2;
        System.out.println("The difference is: " + difference);

        input.close();
    }
}