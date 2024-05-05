import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000, 1, "2024-05-01", "Developer");
        Worker worker2 = new Worker("Alice", 1800, 2, "2024-05-02", "QA Engineer");
        Worker worker3 = new Worker("Bob", 2200, 3, "2024-05-03", "Software Engineer");
        Worker worker4 = new Worker("Eva", 1900, 4, "2024-05-04", "DevOps Engineer");
        Manager manager = new Manager("Michael", 4000, 5, "2024-05-05", "Project Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
            employee.work();
        }
    }
}