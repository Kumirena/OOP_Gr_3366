public class ComplexNumber {
    private double realPart; // действительная часть комплексного числа
    private double imaginaryPart; // мнимая часть комплексного числа

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    //переопределение метода toString() 
     

    @Override
    public String toString() {
        if (imaginaryPart >= 0) {
            return realPart + " + " + imaginaryPart + "i";
        } else {
            return realPart + " - " + (-imaginaryPart) + "i";
        }
    }

    //возвращаем действительную часть

    public double getReal() {
        return realPart;
    }

    //возвращаем мнимую часть
    
    public double getImaginary() {
        return imaginaryPart;
    }
}