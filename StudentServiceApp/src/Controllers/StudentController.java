package Controllers;

import StudentDomen.Student;
import StudentService.StudentGroupService;
import StudentService.StudentService;

//контроллер для студентов
public class StudentController implements iUserController<Student> {
    /**
     * финальный экземпляр класса
     */
    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();
    
    
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
        
    }
   
    
}