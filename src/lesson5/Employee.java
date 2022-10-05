/**
 * @author ann
 * @data 06.10.22
 */
package lesson5;

public class Employee {
    private String employeeFullName;
    private String employeeJobTitle;
    private String employeeEmail;
    private String employeePhoneNumber;
    private int employeeAge;

    public Employee(String employeeFullName, String employeeJobTitle, String employeeEmail, String employeePhoneNumber, int employeeAge) {
        this.employeeFullName = employeeFullName;
        this.employeeJobTitle = employeeJobTitle;
        this.employeeEmail = employeeEmail;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeAge = employeeAge;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public String getEmployeeJobTitle() {
        return employeeJobTitle;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }
}
