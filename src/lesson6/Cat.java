/**
 * @author ann
 * @data 06.10.22
 */
package lesson6;

public class Cat extends Animal{

    private final static int MAX_RUN_LENGTH = 200;
    private final static int MAX_SWIM_LENGTH = 0;
    private static int counter = 1;

    public Cat(){
        super(MAX_RUN_LENGTH, MAX_SWIM_LENGTH, counter++);
    }

    @Override
    public String name() {
        return "cat";
    }
}