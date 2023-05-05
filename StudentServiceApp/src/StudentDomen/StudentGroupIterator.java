package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;//создаем список
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }
    @Override
    public boolean hasNext() {//проверка на то, что счетчик достиг предела
       return counter<students.size();
    }
    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;//добавляем проверку
        }
        // counter++;
        return students.get(counter++);        
    }
    
}


