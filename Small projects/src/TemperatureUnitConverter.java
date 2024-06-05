import java.util.Scanner;
import java.lang.NumberFormatException;

class Converter{
    double celsius;
    double fahrenheit;

    //method to convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius){
        fahrenheit = (1.8*celsius)+32;//celsius to fahrenheit formula
        return fahrenheit;
    }
    //method to  convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit){
        celsius = (fahrenheit - 32)*5/8;//fahrenheit to celsius formula
        return celsius;
    }
}

public class TemperatureUnitConverter {
    public static void main(String[] args) {
        double tempValue;
        String unit;
        Scanner scanner = new Scanner(System.in);
        Converter convert = new Converter();

        while (true){
        System.out.println("\nEnter temperature:");

        try {
            tempValue=Double.parseDouble(scanner.nextLine());
            System.out.println("Celsius or Fahrenheit?(c/f): ");
            unit = scanner.nextLine().toUpperCase();

            if (unit.equals("C")) {
                int fahrenheit = (int) convert.celsiusToFahrenheit(tempValue);
                System.out.println((int)tempValue + " Celsius is equal to " + fahrenheit + " Fahrenheit");
            } else if (unit.equals("F")) {
                int celsius = (int) convert.fahrenheitToCelsius(tempValue);
                System.out.println((int)tempValue + " Fahrenheit is equal to " + celsius + " Celsius");
            } else {
                throw new IllegalArgumentException("Invalid unit. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
    }
}
