package lesson2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private final static int percent = 8;
    public static void main(String[] args) {
        String name = getName();
        int amount = getAmount();
        printDeposit(name, amount);
    }
    public static String getName(){
        String name;
        System.out.println("Enter your name:");
        name = scanner.nextLine();
        return name;
    }
    public static int getAmount(){
        int amount;
        System.out.println("Enter the amount:");
        if(scanner.hasNextInt()){
            amount = scanner.nextInt();
        } else {
            System.out.println("Error. Try again.");
            scanner.next();
            amount = getAmount();
        }
        return amount;
    }
    public static void printDeposit(String name, int amount){
        // S=(P*I*t):K*100
        System.out.println("Hello "
                + name + ", your deposit\n for the 1 year: " + (amount + (amount * percent * 365) / (365 * 100))
                + "\n for the 2 years: " + (amount + (amount * percent * 730) / (365 * 100))
                + "\n for the 5 years: " + (amount + (amount * percent * 1825) / (365 * 100))
                + "\n for the 10 years: " + (amount + (amount * percent * 3650) / (365 * 100))
        );
    }
}