import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
<<<<<<< HEAD
                //double mod;
                =======
>>>>>>> d32c01a941b395920539e2486f7cd2767a663ebf
        double num1;
        double num2;
        double result;
        while (true) {
            Scanner input = new Scanner(System.in);
<<<<<<< HEAD
            System.out.println( "press operator (+,-,*,/, %) to continue or press Q or q to Quit :");
=======
            System.out.println( "press operator (+,-,*,/) to continue or press Q or q to Quit :");
>>>>>>> d32c01a941b395920539e2486f7cd2767a663ebf
                    operator = input.next().charAt(0);
            if (operator == 'Q' || operator == 'q') {
                break;
            }
            else {
                System.out.println("Enter first number: ");
                num1 = input.nextDouble();
                System.out.println("Enter second number: ");
                num2 = input.nextDouble();
                switch (operator) {
<<<<<<< HEAD
                    case '%':
                        result = num1 % num2;
                        System.out.println(num1 + " % " + num2 + " = " + result);
                        break;
=======
>>>>>>> d32c01a941b395920539e2486f7cd2767a663ebf
                    // performs addition between numbers
                    case '+':
                        result = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        break;
                    // performs subtraction between numbers
                    case '-':
                        result = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        break;
                    // performs multiplication between numbers
                    case '*':
                        result = num1 * num2;
                        System.out.println(num1 + " * " + num2 + " = " + result);
                        break;
                    // performs division between numbers
                    case '/':
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                        break;

                    default:
                        System.out.println("Invalid operator!");
                        break;
                }
            }
        }
    }
}
