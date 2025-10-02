// Employee.java
public abstract class Employee {
    // Private fields (Encapsulation)
    private int id;
    private String name;
    private double baseSalary;

    // Static counter to track number of employees
    private static int employeeCount = 0;

    // Constructor
    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        employeeCount++; // increment each time an employee is created
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // Abstract Method
    public abstract double calculateSalary();

    // Concrete Method
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Base Salary:  %.0f%n" , baseSalary);
    }

    // Static Method
    public static int getEmployeeCount() {
        return employeeCount;
    }
}
