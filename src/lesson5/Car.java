/**
 * @author ann
 * @data 06.10.22
 */
package lesson5;

public class Car {

    public static void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private static void startElectricity(){
        System.out.println("startElectricity");
    }
    private static void startCommand(){
        System.out.println("startCommand");
    }
    private static void startFuelSystem() {
        System.out.println("startFuelSystem");
    }
 }