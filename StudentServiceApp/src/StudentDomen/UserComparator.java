package StudentDomen;

import java.util.Comparator;

/**
 * создаем класс (generic -обобщённые функции) позволяющий нам сравнивать классы потомков User
 */
/** подключаем интерфейс компeратора */
public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        
        // Сравниваем по именам
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());

        // Если имена совпадают, сравниваем по фамилиям
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultOfComparing;
        } else
            return resultOfComparing;
    }
}




    