package Department;
import Employee.Employee;
public class Department {
    private String name;

    private Employee[] employees = new Employee[5];

    private int lastAdditionalEmployeeIndex = -1;

    public Department(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addEmployee(Employee plusEmployee){
        if(lastAdditionalEmployeeIndex < employees.length){
            lastAdditionalEmployeeIndex++;
            employees[lastAdditionalEmployeeIndex] = plusEmployee;
        }
    }
}
