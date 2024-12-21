import Department.Department;
import Employee.Employee;
public class HRAppclass {

    public static void main(String[] args) {
        System.out.println("HRApp Starts: ");
        Employee s2 = new Employee(70, "Kai Jie", 40000);
        Employee s3 = new Employee(71, "Ming Sheng", 40000);
        

        Department d1 = new Department("BUSSINESS");
        d1.addEmployee(new Employee(69, "Voon Xien", 56000));
        d1.addEmployee(s2);
        d1.addEmployee(s3);

        Employee[] employees = d1.getEmployees();
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Employee " + employee);
            }
        }
        System.out.println("Total Salary: RM" + d1.getDepartmentSalary());
        System.out.printf("Average Salary: RM%.2f%n", d1.getAverageSalary());
        System.out.println("Employee: " + d1.getEmployeeID(70));
    }
}
