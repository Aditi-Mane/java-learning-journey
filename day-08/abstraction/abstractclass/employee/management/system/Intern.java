package abstractclass.employee.management.system;

public class Intern extends Employee {
    private double fixedStipend;

    public Intern(String name, int employeeId, double fixedStipend){
        super(name, employeeId);
        this.fixedStipend = fixedStipend;
    }

    @Override
    void displayEmployeeType() {
        System.out.println("Type: Intern");
    }

    @Override
    double calculateSalary() {
        return fixedStipend;
    }
}
