package comparable;

public class Employee implements Comparable<Employee>{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override //defines natural ordering of the class
    public int compareTo(Employee other){
        return Double.compare(this.salary,other.salary); //ascending
        //for descending -> return Double.compare(other.salary,this.salary);
    }

    @Override
    public String toString() {
        return name + " -> " + salary;
    }
}
