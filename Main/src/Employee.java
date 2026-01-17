public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(String name, int age, String position, double salary) {
        super(name, age);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() { return position; }
    public double getSalary() { return salary; }

    public void setPosition(String position) { this.position = position; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public void info() {
        System.out.println("Name: " + getName() +
                ". Age: " + getAge() +
                ". Position: " + position +
                ". Salary: " + salary);
    }
}
