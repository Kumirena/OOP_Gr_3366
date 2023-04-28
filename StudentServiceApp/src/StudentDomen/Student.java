package StudentDomen;

/**
 * класс Student наследуем от User и подключаем метод сортировки (implements Comparable)
 */
public class Student extends User implements Comparable<Student>{
    private long studentID;
/**
        * добавляем конструктор, где передаем поля из класса User
        * @param firstName
        * @param secondName
        * @param age
        * @param studentId
        */
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }
/**
        * метод, позволяющий получить ID студента
        * @return
        */

    public long getStudentID() {
        return studentID;
    }
 /**
        * метод, позволяющий задать ID студента
        * @param studentId
        */
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }
/**
       переопределение метода вывода на экран   */
    @Override
    public String toString() {
        return "Student{" 
 //обращаемся к родителю               
                +"firstName=" +super.getFirstName()
                +", secondName=" +super.getSecondName()
                +", age=" +super.getAge()+
                ", studentID=" + studentID +
                '}';
    }
/**
        * подключаем метод сортировки
        */

    @Override
    public int compareTo(Student o) {
        
        System.out.println(super.getFirstName()+" - "+o.getFirstName());
         if(super.getAge()==o.getAge())
  //  пишем условие для сортировки        
         {
            if(this.studentID==o.studentID)
            {
                return 0;
            }
            if(this.studentID<o.studentID)
            {
                return -1;
            }
            return 1;
         } 
         if(super.getAge()<o.getAge())
         {
            return -1;
         }   
         return 1;
    }
}

