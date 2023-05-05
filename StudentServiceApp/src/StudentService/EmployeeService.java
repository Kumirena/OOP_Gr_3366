package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.AverageAgeCalculator;
import StudentDomen.Employee;
import StudentDomen.UserComparator;

public class EmployeeService implements iUserService<Employee> {
    private int count;
    private  List<Employee> employees;

    /*
     * конструктор для записи сотрудников
     */
    public  EmployeeService(){
        this.employees = new ArrayList<Employee>();
    }
    /**
     * добавление сотрудника в базу
     */
    @Override
    public void create(String firstName, String secondName, int age) {
       Employee per = new Employee(firstName, secondName, age, count);
       count++;
       employees.add(per);        
    }
    /**
     * возвращаем список сотрудников
     */
    @Override
    public List<Employee> getAll() {
       return employees;
    }
    /**
     * метод сортировки сотрудников
     * @param numberGroup
     * @return
     */
    public List<Employee> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Employee> emps = new ArrayList<>();
        emps.sort(new UserComparator<Employee>());
        return emps;
    }

     static public  double calculateAverageAge(List<Employee> employees) {
        AverageAgeCalculator<Employee> calculator = new AverageAgeCalculator<>(employees);
        return calculator.calculateAverageAge();
    }
    
 }  
  
