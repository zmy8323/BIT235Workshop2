public class Exercise1_6 {
    public static void main(String[] args) {
        double tank = 40.0;
        double normalFuelPer100Km = 8.0;
        double roughFuelPer100Km = normalFuelPer100Km * 1.15;

        double normalDistance = tank / normalFuelPer100Km * 100.0;
        double roughDistance = tank / roughFuelPer100Km * 100.0;

        System.out.printf("Distance on normal roads = %.2f km%n", normalDistance);
        System.out.printf("Distance on rough roads = %.2f km%n", roughDistance);
    }
}