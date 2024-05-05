import company.models.Worker;
import company.models.Manager;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000, 1);
        Worker worker2 = new Worker("Alice", 1800, 2);
        Worker worker3 = new Worker("Bob", 2200, 3);
        Worker worker4 = new Worker("Eva", 1900, 4);

        Manager manager = new Manager("Michael", 3500, 5);

        System.out.println("Worker 1 salary: " + worker1.getSalary());
        worker1.work();

        System.out.println("Worker 2 salary: " + worker2.getSalary());
        worker2.work();

        System.out.println("Worker 3 salary: " + worker3.getSalary());
        worker3.work();

        System.out.println("Worker 4 salary: " + worker4.getSalary());
        worker4.work();

        System.out.println("Manager salary: " + manager.getSalary());
        manager.work();
        
    }

}
