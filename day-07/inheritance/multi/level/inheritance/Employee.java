package multi.level.inheritance;

public class Employee extends Person {
    private int employeeId;
    private double salary;

    public Employee(String name, int age, int employeeId, double salary){
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Salary: "+salary);
    }
}
