public class App {

    public static void main(String[] args) {

        // Создание экземпляров View и Calculator

        ViewCalculator view = new ViewCalculator();
        Calculator calculator = new Calculator();
        int choice = 0;
        while (choice != 4) {

        // Вывод на экран 

        view.showMenu();
        choice = view.getMenu();

        // Выбор операции, ввод  чисел пользователем

        switch (choice) {
            case 1://сложение

                ComplexNumber num1 = view.getComplexNumber();
                ComplexNumber num2 = view.getComplexNumber();
                calculator.setOperation(new LogDecorator(OperationFactory.createOperation("addition")));
                ComplexNumber sum = calculator.execute(num1, num2);
                break;
            case 2: //деление

                ComplexNumber num3 = view.getComplexNumber();
                ComplexNumber num4 = view.getComplexNumber();
                calculator.setOperation(new LogDecorator(OperationFactory.createOperation("division")));
                ComplexNumber division = calculator.execute(num3, num4);
                break;
            case 3:// умножение

                ComplexNumber num5 = view.getComplexNumber();
                ComplexNumber num6 = view.getComplexNumber();
                calculator.setOperation(new LogDecorator(OperationFactory.createOperation("multiplication")));
                ComplexNumber result = calculator.execute(num5, num6);
                break;
            case 4:// Выход из программы

                    System.out.println("Выход");
                    break;
                default:

            }
        }
    }
}