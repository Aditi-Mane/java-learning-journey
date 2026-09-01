package employee.system;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    private static String companyName = "TechCorp";
    private static int employeeCount;

    public Employee(int id, String name, double salary, String department){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;

        employeeCount++;
    }

    //copy constructor
    public Employee(Employee e){
        this.id = e.id;
        this.name = e.name;
        this.salary = e.salary;
        this.department = e.department;

        employeeCount++;
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if(salary >= 0){
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative");
        }
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    public void displayDetails(){
        System.out.println("ID: "+this.getId());
        System.out.println("Name: "+this.getName());
        System.out.println("Salary: "+this.getSalary());
        System.out.println("Department: "+this.getDepartment());
    }

    public static int getEmployeeCount(){
        return employeeCount;
    }

}
