import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000, 1, "01-01-2022","Junior Developer");
        Worker worker2 = new Worker("Alice", 1800, 1,"15-12-2021", "Developer");
        Worker worker3 = new Worker("Bob", 2200, 3, "10-02-2020", "Senior Developer");
        Worker worker4 = new Worker("Eva", 1900, 4, "05-03-2020", "Mid-Level Developer");

        Manager manager = new Manager("Michael", 3500, 5, "15-11-2015","Project Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + 
                                employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + 
                                employee.getSalary() + ")");
            employee.work();

            if (worker1.equals(employee)) {
                System.out.println(worker1.getName() + " is equal to " + employee.getName());
            } else {
                System.out.println(worker1.getName() + " is not equal to " + employee.getName());
            }

           
            
        }
        
        
    }

}
