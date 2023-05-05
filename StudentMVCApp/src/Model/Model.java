package Model;

import java.util.List;

import Controller.iGetModel;
import java.util.ArrayList;
import java.util.HashMap;
public class Model implements iGetModel {
   /* private List<Student> students;//список студентов (из файлов)

    public Model(List<Student> students) {
        this.students = students;
    }
    /*
//метод, котрый будет выдавать нам информацию
    public List<Student> getAllStudent()
    {
        return students;
    }*/
    private HashMap<Long, Student> students; //список студентв с ID

     public Model(List<Student> students) {
        HashMap<Long, Student> stud = new HashMap<>();
        for (Student s : students) {
            stud.put(s.getStudentID(), s);
        }
        this.students = stud;
    }
 
    public List<Student> getAllStudent()
    {
        List<Student> studs = new ArrayList<>();
        for (Long id : this.students.keySet()) {
            studs.add(this.students.get(id));
        }
        return studs;
    }

    @Override
     public boolean deleteStudent(Long id) {
         students.remove(id);
         return false;
    }
}
