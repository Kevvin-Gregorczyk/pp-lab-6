import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000.0, 1);
        Worker worker2 = new Worker("Alice", 2200.0, 2);
        Worker worker3 = new Worker("Bob", 1800.0, 3);
        Worker worker4 = new Worker("Eva", 2500.0, 4);

        Manager manager = new Manager("Mike", 3500.0, 5);

        System.out.println("Workers:");
        System.out.println("Worker 1 salary: " + worker1.getSalary());
        worker1.work();
        System.out.println("Worker 2 salary: " + worker2.getSalary());
        worker2.work();
        System.out.println("Worker 3 salary: " + worker3.getSalary());
        worker3.work();
        System.out.println("Worker 4 salary: " + worker4.getSalary());
        worker4.work();

        System.out.println("\nManager:");
        System.out.println("Manager salary: " + manager.getSalary());
        manager.work();
    }
}