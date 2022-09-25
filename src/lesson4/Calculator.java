/**
 * @author ann
 * @data 25.09.22
 */
package lesson4;

import java.util.Scanner;

public class Calculator {
    static boolean askExit = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double firstNumber = getNumber();
        double secondNumber = getNumber();
        String operator = getOperator();
        calculate(firstNumber, secondNumber, operator);
        do {
            askExit = askExit();
        }while(askExit);
        scanner.close();
    }
    public static double getNumber(){
        System.out.println("Enter a number");
        double number;
        if(scanner.hasNextDouble()){
            number = scanner.nextInt();
        } else {
            System.out.println("Error. Try again.");
            scanner.next();
            number = getNumber();
        }
        return number;
    }
    public static String getOperator(){
        System.out.println("Enter an operator (+ - * /)");
        String operator;
        if(scanner.hasNext()){
            operator = scanner.next();
        } else {
            System.out.println("Error. Try again.");
            scanner.next();
            operator = getOperator();
        }
        return operator;
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

    public static boolean askExit(){
        String exit;
        System.out.println("Do you wont to exit? print exit if yes");
        Scanner scanner = new Scanner(System.in);
        exit = scanner.nextLine();
        return exit.equals("exit")? false : true;
    }
}
