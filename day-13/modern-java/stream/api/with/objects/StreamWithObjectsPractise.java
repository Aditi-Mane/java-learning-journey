package stream.api.with.objects;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithObjectsPractise {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Aditi", "IT", 75000),
                new Employee("Rahul", "HR", 55000),
                new Employee("Sneha", "IT", 90000),
                new Employee("Vishal", "Finance", 65000),
                new Employee("Ayush", "IT", 85000)
        );

        // 1. Get the names of IT employees earning more than 70,000, sorted by salary in descending order.
        List<String> filteredEmployees = employees.stream()
                .filter(e -> e.getSalary() > 70000 && e.getDepartment().equals("IT"))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getName)
                .toList();
        System.out.println(filteredEmployees+"\n");

        // 2. Group employees by department.
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        // System.out.println(employeesByDepartment);

        employeesByDepartment.forEach((department, employeeList) -> {
            List<String> names = employeeList.stream()
                    .map(Employee::getName)
                    .toList();
            System.out.println(department+" -> "+names);
        });
        System.out.println();

        // 3. Number of employees in each department
        Map<String, Long> employeesByDepartmentNumber = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())); //downstream collector
        employeesByDepartmentNumber.forEach((department,count) -> {
            System.out.println(department+" -> "+count);
        });
        System.out.println();

        // 4. partition employees into salary >= 70,000 and salary < 70,000
        Map<Boolean, List<Employee>> partitionedEmployees = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() >= 70000));
        partitionedEmployees.forEach((salaryGreaterThan,names) -> {
            if(salaryGreaterThan){
                System.out.println("Employees with salary greater than or equal to 70,000 -> "+names);
            } else {
                System.out.println("Employees with salary less than 70,000 -> "+names);
            }
        });
        System.out.println();

        // 5. Finds the names of employees whose salary is above 70,000, sorts them alphabetically,
        // converts them to uppercase, removes duplicates if any, and collects them into a List.
        List<Employee> employees2 = List.of(
                new Employee("Aditi", "IT", 75000),
                new Employee("Rahul", "HR", 55000),
                new Employee("Sneha", "IT", 90000),
                new Employee("Vishal", "Finance", 65000),
                new Employee("Ayush", "IT", 85000),
                new Employee("Rohan", "HR", 72000),
                new Employee("Meera", "Finance", 80000)
        );

        List<String> filteredNames = employees2.stream()
                .filter(e -> e.getSalary() > 70000)
                .map(e -> e.getName().toUpperCase())
                .distinct()
                .sorted()
                .toList();
        System.out.println(filteredNames);
    }
}
/* OUTPUT
[Sneha, Ayush, Aditi]

Finance -> [Vishal]
HR -> [Rahul]
IT -> [Aditi, Sneha, Ayush]

Finance -> 1
HR -> 1
IT -> 3

Employees with salary less than 70,000 -> [Rahul, Vishal]
Employees with salary greater than or equal to 70,000 -> [Aditi, Sneha, Ayush]

[ADITI, AYUSH, MEERA, ROHAN, SNEHA]
*/
