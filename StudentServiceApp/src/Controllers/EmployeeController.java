package Controllers;
import StudentDomen.User;
import StudentDomen.Employee;
import StudentService.EmployeeService;

/**
 * контроллер для сотрудников
 */

public class EmployeeController implements iUserController<Employee> {
    private final EmployeeService empService = new EmployeeService();

    @Override
    public void create(String firstName, String secondName, int age) {
       empService.create(firstName, secondName, age);
    }

    /**
     * @param <T> защищенный метод выдачи данных(зарплаты)
     * @param person
     */
     static public <T extends Employee> void paySalary(T person)
    {
        System.out.println(((User)person).getFirstName()+" зп 10000");
    }
    // /**
    //  *  метод подсчета средней зарплаты 
    //  * @param <T>
    //  * @param num
    //  * @return
    //  */
     static public <T extends Number> Double mean(T[] num)
    {
        double sum =0.0;
        for (int i = 0; i<num.length; i++)
        {
            sum = sum+num[i].doubleValue();
        }
        sum = sum/num.length;
        return sum;
    }
   
    
}
