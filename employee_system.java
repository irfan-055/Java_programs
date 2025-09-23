public class employee_system {

    private String name;
    private int id;
    private String department;
    private double salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Main method to run the program
    public static void main(String[] args) {
        employee_system emp = new employee_system();
        emp.setName("Alice");
        emp.setId(101);
        emp.setDepartment("Engineering");
        emp.setSalary(75000.0);

        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getId());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Salary: $" + emp.getSalary());
    }
}
