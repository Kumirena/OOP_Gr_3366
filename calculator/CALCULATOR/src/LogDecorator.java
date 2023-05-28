//декоратор для логирования операции над комплексными числами.
 
public class LogDecorator implements iOperationDecorator {
    private iOperation operation;
   
public LogDecorator(iOperation operation) {
    this.operation = operation;
    }

    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
       ComplexNumber result = operation.execute(a, b);
       System.out.println(getDescription() + ": " + operation.getClass().getSimpleName() + " над комплексными числами " + a + " и " + b);
       System.out.println("Результат: " + result);
       return result;
    }

   
    @Override
    public String getDescription() {
       return "Идет выполнение";
    }
 }