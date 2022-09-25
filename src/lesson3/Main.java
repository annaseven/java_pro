package lesson3;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Task #2---");
        printThreeWords();
        System.out.println("---Task #3---");
        checkSumSign();
        System.out.println("---Task #4---");
        printColor();
        System.out.println("---Task #5---");
        compareNumbers();
        System.out.println("---Task #6---");
        checkNumbers(4, 9);
        System.out.println("---Task #7---");
        checkPositiveNegative(0);
        System.out.println("---Task #8---");
        checkTrueNegativ(-7);
        System.out.println("---Task #9---");
        printString("nello hillel", 3);
        System.out.println("---Task #10---");
        isLeapYear(2022);
    }
    public static void printThreeWords() {
        String[] threeWords = {"Orange", "Banana", "Apple"};
        for (String oneWord : threeWords) {
            System.out.println(oneWord);
        }
    }
    public static void checkSumSign() {
        int a = 5, b = -7;
        if (a + b >= 0) {
            System.out.println("the sum is positiv");
        } else {
            System.out.println("the sum is negativ");
        }
    }
    public static void printColor() {
        int value = 100;

        if(value <= 0) {
            System.out.println("red");
        } else if(value > 0 && value <= 100) {
            System.out.println("yellow");
        } else {
            System.out.println("green");
        }
    }
    public static void compareNumbers() {
        int a = 3, b = 7;
        String expression = a >= b? "a >= b" : "a < b";
        System.out.println(expression);
    }
    public static boolean checkNumbers(int a, int b) {
        int sum = a + b;
        return (sum <= 10  &&  sum <= 20)? true : false;
    }
    public static void checkPositiveNegative(int a) {
        if(a < 0) {
            System.out.println("the number is negativ");
        } else {
            System.out.println("the number is positiv");
        }
    }
    public static boolean checkTrueNegativ(int a) {
        return (a < 0)? true : false;
    }
    public static void printString(String str, int count) {
        while(count > 0) {
            System.out.println(str);
            count--;
        }
    }
    public static boolean isLeapYear(int year) {
        /* from
        java.time.Year.of(year).isLeap();
        */
        return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }
}