package company.abstracts;

public class Employee {
    private String name;
    private double salary;
    private int id;
    private String hireDate;
    private String position;

    public Employee(String name, double salary, int id, String hireDate, String position) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.hireDate = hireDate;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Employee)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Employee otherEmployee = (Employee) obj;
        return this.id == otherEmployee.id;
    }
}