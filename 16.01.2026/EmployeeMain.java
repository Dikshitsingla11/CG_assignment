class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double newSalary) {
        salary = newSalary;
    }
}

class Manager extends Employee {
    String managerLevel;

    public Manager(int employeeID, String department, double salary, String managerLevel) {
        super(employeeID, department, salary);
        this.managerLevel = managerLevel;
    }

    public void displayManager() {
        System.out.println("Employee ID: " + employeeID); // public
        System.out.println("Department: " + department);  // protected
        System.out.println("Salary: " + getSalary());     // private via getter
        System.out.println("Level: " + managerLevel);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Manager m = new Manager(501, "IT", 80000, "Senior Manager");

        m.displayManager();
        m.updateSalary(90000);

        System.out.println("Updated Salary: " + m.getSalary());
    }
}
