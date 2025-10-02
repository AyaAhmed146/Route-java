// SalesPerson.java
public class SalesPerson extends Employee {
    private double commission;

    public SalesPerson(int id, String name, double salary, double baseSalary) {
        super(id, name, baseSalary);
        this.commission = commission;
    }

    public double getCommission() { return commission; }
    public void setCommission(double commission) { this.commission = commission; }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + commission;
    }
}
