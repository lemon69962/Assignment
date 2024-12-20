package Employee;

public class Employee{
    private int ID;
    private String name;
    private double salary;

    public Employee(int ID, String name, double salary){
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String toString(){
        return "Employee: " + getID() + ", Name: " + getName() + ", Salary: RM" + getSalary();
    }
}
