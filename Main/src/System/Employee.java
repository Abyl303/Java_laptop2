package System;

public abstract class Employee {
    private int id;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary){
        this.id=id;
        this.name=name;
        setBaseSalary(baseSalary);
    }
    public Employee(){}

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }


    public void setName(String name){
        this.name=name;
    }
    public void setBaseSalary(double baseSalary){
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.baseSalary=baseSalary;
    }

    public abstract double calculateSalary();

    public void printInfo(){
        System.out.println("ID: "+id+". Name: "+name+". Salary: "+baseSalary);
    }
}
