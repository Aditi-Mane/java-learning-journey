package employee.system;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Aditi", 50000.0, "IT");
        Employee e2 = new Employee(102, "Rahul", 60000.0, "HR");
        Employee e3 = new Employee(103, "Priya", 55000.0, "Finance");
        Employee e4 = new Employee(104, "Arjun", 70000.0, "Marketing");

        //change employee's salary
        e1.setSalary(30000);
        System.out.println(e1.getSalary());

        //give someone a negative salary
        e2.setSalary(-2);
        System.out.println(e2.getSalary());
        System.out.println();

        //change company name
        Employee.setCompanyName("The Crimson Wizard");
        System.out.println("Company name changed to "+Employee.getCompanyName());
        System.out.println();

        //print all employees
        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
        System.out.println();

        e3.displayDetails();
        System.out.println();

        e4.displayDetails();
        System.out.println();

        //print employee count
        System.out.println("Employee count is "+Employee.getEmployeeCount());

        //find employee with the highest salary
        Employee[] employees = {e1,e2,e3,e4};
        Employee highest = employees[0];

        for(Employee e: employees){
            if(e.getSalary()>highest.getSalary()){
                highest = e;
            }
        }

        System.out.println(highest.getName()+" has the highest salary of Rs."+highest.getSalary());
        System.out.println();

        //copy constructor: change in copy doesn't affect original
        Employee e5 = new Employee(e1);
        e5.setSalary(100000);
        System.out.println(e1.getSalary()); //original object's salary remains unchanged
        System.out.println(e5.getSalary()); //copy object's salary changes independently
    }
}
/* OUTPUT

30000.0
Salary cannot be negative
60000.0

Company name changed to The Crimson Wizard

ID: 101
Name: Aditi
Salary: 30000.0
Department: IT

ID: 102
Name: Rahul
Salary: 60000.0
Department: HR

ID: 103
Name: Priya
Salary: 55000.0
Department: Finance

ID: 104
Name: Arjun
Salary: 70000.0
Department: Marketing

Employee count is 4
Arjun has the highest salary of Rs.70000.0

30000.0 //e1 salary
100000.0 //e5 (copy) salary

 */
