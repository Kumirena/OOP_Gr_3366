// Интерфейс iOperationDecorator расширяет интерфейс iOperation и добавляет метод getDescription(),
// который описывает операцию.

public interface iOperationDecorator extends iOperation {
    String getDescription();
}