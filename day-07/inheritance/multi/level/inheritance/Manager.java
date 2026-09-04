package multi.level.inheritance;

public class Manager extends Employee {
    private String department;
    private int teamSize;

    public Manager(String name, int age, int employeeId, double salary, String department, int teamSize){
        super(name, age, employeeId, salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    public String getDepartment() {
        return department;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Department: "+department);
        System.out.println("Team Size: "+teamSize);
    }
}