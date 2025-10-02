// BusinessSystem.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collection
        List<Employee> employees = new ArrayList<>();

        // initial employees
        employees.add(new Manager(1, "Alice", 8000, 2000));
        employees.add(new SalesPerson(2, "Bob", 5000.0, 1500.0));
        employees.add(new Intern(3, "Charlie", 0));

        int choice;
        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add New Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. View Total Payroll");
            System.out.println("4. Show Employee Count");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Choose Type: 1. Manager 2. SalesPerson 3. Intern");
                    int type = sc.nextInt();

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Base Salary: ");
                    double baseSalary = sc.nextDouble();

                    if (type == 1) {
                        System.out.print("Enter Bonus: ");
                        double bonus = sc.nextDouble();
                        employees.add(new Manager(id, name, baseSalary, bonus));
                    } else if (type == 2) {
                        System.out.print("Enter Commission: ");
                        double commission = sc.nextDouble();
                        employees.add(new SalesPerson(id, name, baseSalary, commission));
                    } else if (type == 3) {
                        employees.add(new Intern(id, name, baseSalary));
                    }
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    for (Employee emp : employees) {
                        emp.displayInfo();
                        System.out.println("Calculated Salary: " + emp.calculateSalary());

                        // instanceof check
                        if (emp instanceof Manager) {
                            System.out.println("Role: Manager");
                        } else if (emp instanceof SalesPerson) {
                            System.out.println("Role: SalesPerson");
                        } else if (emp instanceof Intern) {
                            System.out.println("Role: Intern");
                        }
                        System.out.println("-------------------------");
                    }
                    break;

                case 3:
                    double totalPayroll = 0;
                    for (Employee emp : employees) {
                        totalPayroll += emp.calculateSalary();
                    }
                    System.out.printf("Total Payroll:  %.0f%n" , totalPayroll);
                    break;

                case 4:
                    System.out.println("Total Employees Created: " + Employee.getEmployeeCount());
                    break;

                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }

        } while (choice != 0);

        sc.close();
    }
}
