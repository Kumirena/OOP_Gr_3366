//операция деления комплексных чисел
 
public class Division implements iOperation {
         
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        // находим знаменатель
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        // находим действительную часть 
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        // находим мнимую часть 
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        // результат - новое комплексное число
        return new ComplexNumber(real, imaginary);
    }
}