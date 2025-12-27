package lab4task2;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber inverse(){
        double denominator = real * real + imaginary * imaginary;

        if(denominator == 0){
            throw new ArithmeticException("Обратного комплексного числа нет: деление на 0");

        }

        double inverseReal = real/denominator;
        double inverseImaginary = -imaginary / denominator;

        return new ComplexNumber(inverseReal, inverseImaginary);

    }

    @Override
    public String toString(){
        if(imaginary == 0){
            return String.format("%.6f", real);
        }
        if(real == 0){
            return String.format("%.6fi", imaginary);
        }
        if(imaginary > 0){
            return String.format("%.6f + %.6fi", real, imaginary);

        } else{
            return String.format("%.6f - %.6fi", real, -imaginary);
        }
        }

    public double getReal() {
        return real;
    }



    public double getImaginary() {
        return imaginary;
    }


}
