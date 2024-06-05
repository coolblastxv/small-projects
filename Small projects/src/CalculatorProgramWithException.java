import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorProgramWithException {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        char ans;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while (!exit) {
            System.out.println("Select your operation");
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 exit");
            try {
                char operator = sc.next().charAt(0);
                switch (operator) {
                    case '1':
                        a = num1();
                        b = num2();
                        int sum = a + b;
                        System.out.println("Sum of your numbers is : " + sum);
                        break;
                    case '2':
                        a = num1();
                        b = num2();
                        int subtract = a - b;
                        System.out.println("Subtraction of your numbers is : " + subtract);
                        break;
                    case '3':
                        a = num1();
                        b = num2();
                        int multiply = a * b;
                        System.out.println("Multiplication of your numbers is : " + multiply);
                        break;
                    case '4':
                        a = num1();
                        b = num2();
                        try {
                            int division = a / b;
                            System.out.println("Division of your numbers is : " + division);
                        } catch (ArithmeticException e) {
                            System.out.println("Cannot divide by zero");
                        }

                        break;
                    case '5':
                        System.out.println("do you want to exit?y/n");
                        ans = sc.next().charAt(0);
                        if (ans == 'y') {
                            exit = true;
                        }
                        break;
                    default:
                        System.out.println("please input correct operation");

                }
            } catch (InputMismatchException e) {
                System.out.println("Please input valid number");
            }
            System.out.println();
        }
    }

    public static int num1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = scanner.nextInt();
        return a;
    }

    public static int num2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter second number");
        int b = scanner.nextInt();
        return b;
    }


}
