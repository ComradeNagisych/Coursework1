import java.util.Objects;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private int salary;
    private int id;

    public Employee(String firstName, String middleName, String lastName, int department, int salary, int id) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = Main.empid++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Employee employee = (Employee) other;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.middleName) && Objects.equals(lastName, employee.lastName) && Objects.equals(id, employee.id);
    }
    @Override
    public int hashCode () {
        return Objects.hash(firstName, middleName, lastName, department, salary, id);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "firstName = " + firstName +
                ", middleName = " + middleName +
                ", lastName = " + lastName +
                ", department = " + department +
                ", salary = " + salary +
                ", id = " + id +
                "!}";
    }
}

