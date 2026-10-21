import java.util.Scanner;

public class Exercise1_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        boolean isEqual = str1.equals(str2);
        System.out.println("the two given strings are equal: " + isEqual);

        boolean firstCharEqual = false;
        if (str1.length() > 0 && str2.length() > 0) {
            firstCharEqual = str1.charAt(0) == str2.charAt(0);
        }

        System.out.println("First characters are equal: " + firstCharEqual);

        input.close();
    }
}