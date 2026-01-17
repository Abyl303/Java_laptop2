package System;

public class Manager extends Employee{
    private int teamSize;

    public Manager(int id, String name, double baseSalary, int teamSize){
        super(id, name, baseSalary);
        setTeamSize(teamSize);
    }

    public int getTeamSize(){
        return teamSize;
    }

    public void setTeamSize(int teamSize){
        if (teamSize < 0) {
            throw new IllegalArgumentException("Team size cannot be negative");
        }
        this.teamSize = teamSize;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + teamSize * 200;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", baseSalary=" + getBaseSalary() +
                ", teamSize=" + teamSize +
                ", salary=" + calculateSalary() +
                '}';
    }
}
