/**
 * @author ann
 * @data 09.10.22
 */
package lesson6;
import java.util.*;
import static lesson6.AnimalType.*;

public class RunApp {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(Animal.of(CAT));
        animals.add(Animal.of(DOG));
        animals.add(Animal.of(CAT));
        animals.add(Animal.of(DOG));
        animals.add(Animal.of(DOG));

        animals.forEach(animal -> {
            System.out.println(animal.run(500));
            System.out.println(animal.run(100));
            System.out.println(animal.swim(10));
            System.out.println(animal.run(900));
            System.out.println(animal.run(200));
            System.out.println(animal.swim(50));
            System.out.println(animal.run(150));
            System.out.println(animal.swim(30));
        });
    }
}