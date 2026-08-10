package lamda_01.StreamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmoliyeeMain {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(

            new Employee(101, "Rahul", "IT", 75000, 28),
            new Employee(102, "Amit", "HR", 55000, 32),
            new Employee(103, "Priya", "IT", 90000, 26),
            new Employee(104, "Neha", "Finance", 65000, 30),
            new Employee(105, "Rohit", "IT", 85000, 35),
            new Employee(106, "Sneha", "HR", 60000, 27),
            new Employee(107, "Vikas", "Finance", 95000, 40),
            new Employee(108, "Anjali", "IT", 70000, 29)
        );

        // Find all employees whose salary is greater than ₹50,000

        List<Employee> empList1 = employees.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .collect(Collectors.toList());

        // Find employees whose salary is greater than ₹50,000
        // and get only employee names

        List<String> namesList = employees.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .map(emp -> emp.getName())
                .collect(Collectors.toList());

        System.out.println(empList1);
        System.out.println(namesList);
    }
}