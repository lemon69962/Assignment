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

    public Employee [] getEmployees(){
        
        Employee[] realEmployees = new Employee[lastAdditionalEmployeeIndex + 1];
        for(int i=0; i<realEmployees.length; i++){
            realEmployees[i] = employees[i];
        }

        return employees;
    }

    public int getLastEmployee(){

        return lastAdditionalEmployeeIndex+1;
    }

    public Employee getEmployeeID(int id){

        for(Employee employee : employees){
            if(employee.getID() == id){
                return employee;
            }
        }
        return null;
    }

    
}
