/**
 * @author ann
 * @data 06.10.22
 */
package lesson6;

public class Dog extends Animal{

    private final static int MAX_RUN_LENGTH = 500;
    private final static int MAX_SWIM_LENGTH = 20;
    private static int counter = 1;

    public Dog(){
        super(MAX_RUN_LENGTH, MAX_SWIM_LENGTH, counter++);
    }

    @Override
    public String name() {
        return "dog";
    }
}