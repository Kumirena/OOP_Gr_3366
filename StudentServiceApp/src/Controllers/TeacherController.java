package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;

//контроллер для учителей
public class TeacherController implements iUserController<Teacher> {
    private final TeacherService teachService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        teachService.create(firstName, secondName, age);;
    }
    
}