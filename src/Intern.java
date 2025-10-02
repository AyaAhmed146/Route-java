// Intern.java
public class Intern extends Employee {

    public Intern(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return 3000.0; // fixed salary for interns
    }
}
