package single.level.inheritance;

public class Manager extends Employee{
    private String department;
    private int teamSize;

    public Manager(int id,String name, double salary, String department, int teamSize){
        super(id, name, salary);
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
        System.out.println("Department: "+this.getDepartment());
        System.out.println("Team size: "+this.getTeamSize());
        System.out.println();
    }

}
