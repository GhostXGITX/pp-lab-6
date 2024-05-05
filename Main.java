import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000, 1, "01-01-2022","Junior Developer");
        Worker worker2 = new Worker("Alice", 1800, 2,"15-12-2021", "Developer");
        Worker worker3 = new Worker("Bob", 2200, 3, "10-02-2020", "Senior Developer");
        Worker worker4 = new Worker("Eva", 1900, 4, "05-03-2020", "Mid-Level Developer");
        Worker worker5 = new Worker("Max", 2500, 6, "08-07-2019", "IT");
        Worker worker6 = new Worker("Eva", 1900, 1, "30-04-2021", "Worker");

        Manager manager1 = new Manager("Michael", 3500, 5, "15-11-2015","Project Manager");
        Manager manager2 = new Manager("Sarah", 4000, 1, "21-09-2017","Senior Project Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalaryAllEmployees = 0;
        double totalSalaryManagers = 0;
        double totalSalaryWorkers = 0;

        for (Employee employee : employees) {
            totalSalaryAllEmployees += employee.getSalary();
            if (employee instanceof Manager) {
                totalSalaryManagers += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalSalaryWorkers += employee.getSalary();
            }
        }

        System.out.println("Total salary of all Employees: " + totalSalaryAllEmployees);
        System.out.println("Total salary of all Managers: " + totalSalaryManagers);
        System.out.println("Total salary of all Workers: " + totalSalaryWorkers);
        

       // for (Employee employee : employees) {
           // System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + 
           //                     employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + 
           //                     employee.getSalary() + ")");
          //  employee.work();

            System.out.println("Instances with the same ID:");
        for (Employee employee : employees) {
            for (Employee otherEmployee : employees) {
                if (employee != otherEmployee && employee.hashCode() == otherEmployee.hashCode()) {
                    System.out.println(employee.getName() + " is equal to " + otherEmployee.getName());
                }
            }
        }

           
            
        }
        
        
    }


