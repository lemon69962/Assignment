
import Department.Department;
import Employee.Employee;
public class HRAppclass {

    public static void main(String[] args) {
        System.out.println("HRApp Starts: ");
        Employee s1 = new Employee(69, "Voon Xien", 56000);
        Employee s2 = new Employee(70, "Kai Jie", 40000);


        Department d1 = new Department("BUSSINESS");
        d1.addEmployee(s1);
        d1.addEmployee(s2);

        Employee[] employees = d1.getEmployees();
        for (Employee employee : employees) {
            System.out.println("Employee "+employee);
        }
    }

}
