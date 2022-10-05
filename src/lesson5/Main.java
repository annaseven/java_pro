/**
 * @author ann
 * @data 06.10.22
 */
package lesson5;

public class Main {

    public static void main(String[] args) {

        /* new employee
         */
        Employee employee = new Employee("Kostya Puzerenko",
                "QA",
                "puzerevich@mail.mail",
                "380501111111",
                38);

        System.out.println(employee.getEmployeeFullName() + "\n"
                + employee.getEmployeeJobTitle() + "\n"
                + employee.getEmployeeEmail() + "\n"
                + employee.getEmployeePhoneNumber() + "\n"
                + employee.getEmployeeAge() + "\n---");

        /* run a car
         */
        Car.start();
    }
}
