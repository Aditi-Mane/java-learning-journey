package abstractclass.employee.management.system;

abstract class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    //concrete method for common display
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+employeeId);
    }

    //abstract methods for respective subclass implementations
    abstract void displayEmployeeType();
    abstract double calculateSalary();
}
