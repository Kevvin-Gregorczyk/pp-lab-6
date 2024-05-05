import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000, 1, "2024-05-01", "Developer");
        Worker worker2 = new Worker("Alice", 1800, 2, "2024-05-01", "Designer");
        Worker worker3 = new Worker("Bob", 2200, 1, "2024-05-01", "Manager");
        Manager manager = new Manager("Emma", 2500, 3, "2024-05-01", "Project Manager");
        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());
        boolean equalsResult = worker3.equals(worker1);
        System.out.println(worker3.getName() + " equals " + worker1.getName() + ": " + equalsResult);
        equalsResult = worker3.equals(worker2);
        System.out.println(worker3.getName() + " equals " + worker2.getName() + ": " + equalsResult);
        equalsResult = worker3.equals(manager);
        System.out.println(worker3.getName() + " equals " + manager.getName() + ": " + equalsResult);
    }
}