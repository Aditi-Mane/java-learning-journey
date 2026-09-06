package abstractclass.fundamentals;

abstract class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    //abstract method: method with no body, meant to be overridden by a subclass
    abstract void calculateSalary();

    //concrete method
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+employeeId);
    }
}
