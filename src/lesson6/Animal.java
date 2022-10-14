/**
 * @author ann
 * @data 06.10.22
 */
package lesson6;

public class Animal {

    private final int maxRunLength;
    private final int maxSwimLength;
    private final int numAnimal;

    public Animal(int maxRunLength, int maxSwimLength, int numAnimals ){
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        this.numAnimal = numAnimals;
    }
    public static Animal of(AnimalType animalType) {
        switch(animalType) {
            case CAT: return new Cat();
            case DOG: return new Dog();
            default: throw new UnsupportedOperationException();
        }
    }

    public String run(int length) {
        return print("run",length <= maxRunLength, length);
    }

    public String swim(int length) {
        return print("swim",length <= maxSwimLength, length);
    }

    public String name() {
        return "animal";
    }

    private String print(String move, boolean done, int length) {
        return name() + numAnimal + " " + move + " " + length + "m" + " -> " + done;
    }
}