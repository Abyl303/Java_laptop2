package System;

public class Developer extends Employee{
    private int completedTasks;

    public Developer(int id, String name, double baseSalary,int completedTasks ){
        super(id, name, baseSalary);
        setCompletedTasks(completedTasks);
    }

    public int getCompletedTasks(){
        return completedTasks;
    }

    public void setCompletedTasks(int completedTasks){
        if (completedTasks < 0) {
            throw new IllegalArgumentException("Completed tasks cannot be negative");
        }
        this.completedTasks = completedTasks;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + completedTasks * 100;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", baseSalary=" + getBaseSalary() +
                ", completedTasks=" + completedTasks +
                ", salary=" + calculateSalary() +
                '}';
    }
}
