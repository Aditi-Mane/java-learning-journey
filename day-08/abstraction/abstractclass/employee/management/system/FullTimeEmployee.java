package abstractclass.employee.management.system;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int employeeId, double monthlySalary){
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void displayEmployeeType() {
        System.out.println("Type: Full Time");
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}
