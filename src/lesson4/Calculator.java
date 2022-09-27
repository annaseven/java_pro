/**
 * @author ann
 * @data 25.09.22
 */
package lesson4;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        boolean calculator = true;
        Scanner scanner = new Scanner(System.in);

        while(calculator){
            System.out.println("Enter a first number");
            double firstNumber = scanner.nextInt();
            System.out.println("Enter a second number");
            double secondNumber = scanner.nextInt();
            System.out.println("Enter an operator (+ - * /)");
            String operator = scanner.next();

            calculate(firstNumber, secondNumber, operator);

            System.out.println("Do you wont to exit? print 1 if yes");
            int exit = scanner.nextInt();
            calculator = exit == 1? false : true;
        }

        scanner.close();
    }
    public static void calculate(double num, double num2, String operator){

        switch (operator) {
            case "+":
                System.out.println(num + num2);
                break;
            case "-":
                System.out.println(num - num2);
                break;
            case "*":
                System.out.println(num * num2);
                break;
            case "/":
                System.out.println(num / num2);
                break;
            default:
                System.err.println("Invalid action");
        }
    }
}
