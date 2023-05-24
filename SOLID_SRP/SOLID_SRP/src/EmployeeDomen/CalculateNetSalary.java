package EmployeeDomen;

import Controller.iCalculateNetSalary;
//необходимо вынести метод CalculateNetSalary в отдельный класс, т.к. расчетом заработной платы 
//занимается "бухгалтерия", а не работник

public class CalculateNetSalary implements iCalculateNetSalary {
    private Salary salary;

    public CalculateNetSalary(Salary salary) {
        this.salary = salary;
    }

    // метод, позволяющий раcсчитать зарплату сотрудника 
    public int calculateNetSalary() {        
        int tax = (int) (salary.getBaseSalary() * 0.25);
        return salary.getBaseSalary() - tax;
    }
}
