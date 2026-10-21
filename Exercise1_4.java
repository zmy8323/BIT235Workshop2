public class Exercise1_4 {
    public static void main(String[] args) {
        double P = 5000.00;
        double r = 0.04;
        int n = 10;

        double A = P * Math.pow(1 + r, n);

        System.out.printf("Amount after %d years = $%.2f%n", n, A);
    }
}