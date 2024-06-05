import java.util.ArrayList;
import java.util.List;
interface Employee {
    void displayDetails();
}

class Manager implements Employee {
    String name;
    int ID;
    double salary;
    String department;

    public Manager(String name,int ID, double salary,String department ){
        this.name = name;
        this.ID= ID;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("name: "+name);
        System.out.println("ID: " + ID);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);

    }

    public double getSalary() {
        return salary;
    }


}
class Developer implements Employee{
    String name;
    int ID;
    double salary;
    String programmingLanguage;

    public Developer(String name, int ID , double salary, String programmingLanguage){
        this.name = name;
        this.ID = ID;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("name: "+name);
        System.out.println("ID: " + ID);
        System.out.println("Salary: "+salary);
        System.out.println("Programming Language: "+programmingLanguage);
    }


    public double getSalary() {
        return salary;
    }


}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Create an ArrayList of Employee objects
        List<Employee> employees = new ArrayList<>();

        // Populate the ArrayList with instances of Manager and Developer
        employees.add(new Manager("John Doe", 101, 80000, "Sales"));
        employees.add(new Manager("James", 102, 70000, "Marketing"));
        employees.add(new Developer("Alice ", 201, 50000, "Java"));
        employees.add(new Developer("Bobby", 202, 55000, "Python"));

        // Iterate over the array and call displayDetails() for each employee
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }

        // Calculate and display the total salary of all employees
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                totalSalary += ((Manager) employee).getSalary();
            } else if (employee instanceof Developer) {
                totalSalary += ((Developer) employee).getSalary();
            }
        }
        System.out.println("Total Salary of all employees: $" + totalSalary);
    }
}
