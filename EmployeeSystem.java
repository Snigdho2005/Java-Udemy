class Employee {
    protected String name;
    protected int id;
    protected double baseSalary;
    protected double bonusPercentage;

 
    public Employee(String name, int id, double baseSalary, double bonusPercentage) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.bonusPercentage = bonusPercentage;
    }


    public double calculateSalary() {
        return this.baseSalary + (this.baseSalary * this.bonusPercentage / 100);
    }


    public void display() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + calculateSalary());
    }
}

class Manager extends Employee {
    private double incentive;

    public Manager(String name, int id, double baseSalary, double bonusPercentage, double incentive) {
        super(name, id, baseSalary, bonusPercentage);
        this.incentive = incentive;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + this.incentive;
    }

    @Override
    public void display() {
        System.out.println("Manager: " + name + ", ID: " + id + ", Salary: " + calculateSalary());
    }
}


public class EmployeeSystem {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 101, 50000, 10);
        emp.display(); 

        Manager mgr = new Manager("Alice Smith", 102, 70000, 15, 5000);
        mgr.display(); 
    }
}