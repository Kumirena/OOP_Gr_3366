import java.sql.Date;

import Controller.iCalculateNetSalary;
import EmployeeDomen.Employee;
import EmployeeDomen.Salary;
import EmployeeDomen.CalculateNetSalary;

public class App {
    public static void main(String[] args) throws Exception {
        
        Employee person1 = new Employee("Фамилия", new Date(00-00-00));
        Salary salary = new Salary(30000);
        iCalculateNetSalary calcSalary = new CalculateNetSalary(salary);
        int netSalary = calcSalary.calculateNetSalary();
        System.out.println(person1.getEmpInfo() + netSalary + " рублей.");       
}

}