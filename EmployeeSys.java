package Codes;
import java.util.ArrayList;

class Employee {
    String name;
    String id;
    String roles;
    double baseSalary;

    Employee(String name, String id, String roles, double baseSalary) {
        this.name = name;
        this.id = id;
        this.roles = roles;
        this.baseSalary = baseSalary;
    }

    void calculateSalary(String roles) {
        double salary = baseSalary;
        double tax = 0;
        switch (roles) {
            case "Manager":
                salary += baseSalary * 0.2;
                tax = salary * 0.1;
                System.out.println("Salary: " + (salary - tax));
                break;

            case "Developer":
                salary += baseSalary * 0.1;
                tax = salary * 0.1;
                System.out.println("Salary: " + (salary - tax));
                break;

            case "Designer":
                salary += baseSalary * 0.05;
                tax = salary * 0.1;
                System.out.println("Salary: " + (salary - tax));
                break;

            case "Intern":
                salary = 1000;
                tax = salary * 0.1;
                System.out.println("Salary: " + (salary - tax));
                break;
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Role: " + roles);
        calculateSalary(roles);
    }
}

class Manager extends Employee {
    ArrayList<Employee> employees = new ArrayList<>();

    Manager(String name, String id, String roles, double baseSalary) {
        super(name, id, roles, baseSalary);
    }

    // Method to add an employee under the manager's supervision
    void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // Method to display the manager's team and calculate their salary
    void displayTeamSalary() {
        System.out.println("\nTeam of " + name + " (" + roles + "):");
        for (Employee emp : employees) {
            emp.display();  // Display each employee's info and salary
        }
    }
}

public class EmployeeSys {
    public static void main(String[] args) {
        // Creating employees
        Employee emp1 = new Employee("John Doe", "1234", "Manager", 50000);
        Employee emp2 = new Employee("Jane Doe", "5678", "Developer", 40000);
        Employee emp3 = new Employee("Alice", "9101", "Designer", 30000);
        Employee emp4 = new Employee("Bob", "1122", "Intern", 0);  // Intern gets a fixed salary

        // Creating manager and assigning employees to them
        Manager manager1 = new Manager("Michael Smith", "7788", "Manager", 70000);
        manager1.addEmployee(emp2);
        manager1.addEmployee(emp3);
        manager1.addEmployee(emp4);

        // Displaying the manager and their team's information
        manager1.display(); // Manager info
        manager1.displayTeamSalary(); // Team and their salaries
    }
}
