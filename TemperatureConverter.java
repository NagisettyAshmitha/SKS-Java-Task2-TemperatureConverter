import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== TEMPERATURE CONVERTER =====");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Celsius: ");
                    double c = sc.nextDouble();

                    System.out.println("Fahrenheit = " +
                            celsiusToFahrenheit(c));
                    break;

                case 2:
                    System.out.print("Enter Fahrenheit: ");
                    double f = sc.nextDouble();

                    System.out.println("Celsius = " +
                            fahrenheitToCelsius(f));
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 3);

        sc.close();
    }
}