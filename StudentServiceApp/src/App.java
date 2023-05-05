import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentCourse;
import StudentDomen.StudentGroup;

import Controllers.EmployeeController;
import StudentDomen.Employee;
import StudentDomen.Teacher;
import StudentService.EmployeeService;
import StudentService.StudentService;
import StudentService.TeacherService;



public class App { 
        public static void main(String[] args) throws Exception {
        // User u1 =new User("Boris", "Borisov", 25);
       
        Student s1 = new Student("Sergey","Sergeev", 18, 170);
        Student s2 = new Student("Maria","Alexandrova", 25, 112);
        Student s3 = new Student("Dasha","Alexeeva", 20, 123);
        Student s4 = new Student("Vadim","Ivashkin", 24, 139);
        Student s5 = new Student("Michail","Zimarin", 20, 151);
        Student s6 = new Student("Victoria","Marmeladova",25, 223);
        Student s7 = new Student("Victor","Semenov", 18, 134);
        Student s8 = new Student("Daria","Smirnova", 22, 100);
        Student s9 = new Student("Esenia","Averkova",21, 333);
        Student s10 = new Student("Semen","Smirnov", 21, 444);
        Student s11 = new Student("Alevtina","Shatalova", 25, 555);
        Student s12 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s13 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s14 = new Student("Иван", "Петров", 22, (long)121);
        Student s15 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s16 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s17 = new Student("Лена", "Незабудкина", 23, (long)104);
        /**
         * добавляем студентов в списки групп
         */
        
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s7);
        listStud3.add(s8);
        listStud3.add(s9);
        List<Student> listStud4 = new ArrayList<Student>();
        listStud4.add(s10);
        listStud4.add(s11);
        listStud3.add(s12);
        List<Student> listStud5 = new ArrayList<Student>();
        listStud5.add(s13);
        listStud5.add(s14);
        listStud3.add(s15);
        List<Student> listStud6 = new ArrayList<Student>();
        listStud5.add(s16);
        listStud5.add(s17);
        
        List<StudentGroup> listCourse = new ArrayList<StudentGroup>();
        listCourse.add(new StudentGroup(listStud1, 1));
        listCourse.add(new StudentGroup(listStud2, 2));
        listCourse.add(new StudentGroup(listStud3, 3));
        listCourse.add(new StudentGroup(listStud4, 4));
        listCourse.add(new StudentGroup(listStud5, 5));
        listCourse.add(new StudentGroup(listStud6, 6));
            
            StudentCourse course = new StudentCourse(listCourse);
            Collections.sort(course.getCourses()); // сортируем курсы 
            for (StudentGroup group :course.getCourses()) { // проходимся по каждой группе в каждом курсе
            System.out.println("Course:" + group.getCourse() ); // выводим номер курса
           
                Collections.sort(group.getStudents()); // сортируем студентов в группе 
                for (Student student : group.getStudents()) { // проходимся по каждому студенту в группе
                System.out.println(student); // выводим на печать группу и студента в ней
                }
            }
                
       
//сотрудники 
            // Emploee person1 = new Emploee("Иванов", "Олег",55, 110);
            // // Student s12 = new Student("Sergey","Ivanov", 41, 180);
            // // Teacher person1_2 = new Teacher("Кузьмин", "Борис",60, 0201, "PhD");
            // // EmploeeController contrEmp = new EmploeeController();
                   
            // EmploeeController.paySalary(person1);
            // EmploeeController.paySalary(person1_2);
            
            Integer studHour[] = {124,45,34,124,67}; // часы студентов
            System.out.println(EmployeeController.mean(studHour));//вызываем метод - jenerik

            Double emplSalary[] = {12556.7,34543.0,10000.0};
            System.out.println(EmployeeController.mean(emplSalary));
            Teacher person1 = new Teacher("Иван", "Иванов", 35, 46, "Математика");
            Teacher person2 = new Teacher("Петр", "Петров", 60, 34, "Физика");
            Teacher person3 = new Teacher("Сидор", "Сидоров", 30, 35,"История");
            List<Teacher> teachers = new ArrayList<Teacher>();
            teachers.add(person1);
            teachers.add(person2);
            teachers.add(person3);
            double averageTeacherAge = TeacherService.calculateAverageAge(teachers);
            System.out.println("Средний возраст преподавателей: " + averageTeacherAge);

            Student s25 = new Student("Sergey","Ivanov",33 , 180);
            Student s20 = new Student("Oleg","Vetrov", 24, 111);
            Student s30 = new Student("Dasha","Rideeva", 24, 123);
            List<Student> students = new ArrayList<Student>();
            students.add(s25);
            students.add(s20);
            students.add(s30);
            double averageStudentAge = StudentService.calculateAverageAge(students);
            System.out.println("Средний возраст студентов: " + averageStudentAge);

            Employee pers1 = new Employee("Шванов", "Олег",65, 110);
            Employee pers2 = new Employee("Петров", "Олег",50, 119);
            Employee pers3 = new Employee("Иванов", "Олег",55, 118);
            List<Employee> employees = new ArrayList<Employee>();
            employees.add(pers1);
            employees.add(pers2);
            employees.add(pers3);
            double averageEmployeeAge = EmployeeService.calculateAverageAge(employees);
            
            System.out.println("Средний возраст сотрудников: " + averageEmployeeAge);


    }
}
    
