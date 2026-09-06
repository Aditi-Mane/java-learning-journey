package abstractclass.fundamentals;

public class Developer extends Employee {
    public Developer(String name, int employeeId){
        super(name, employeeId);
    }

    @Override
    void calculateSalary() {
        System.out.println("Calculating Developer Salary...");
    }
}
