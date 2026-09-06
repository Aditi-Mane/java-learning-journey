package abstractclass.employee.management.system;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int employeeId, int hoursWorked, double hourlyRate){
        super(name, employeeId);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    void displayEmployeeType() {
        System.out.println("Type: Part Time");
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
