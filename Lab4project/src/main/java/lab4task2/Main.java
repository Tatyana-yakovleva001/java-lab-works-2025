package lab4task2;

public class Main {
    public static void main(String[] args){
        ComplexNumber z = new ComplexNumber(1, -2);
        System.out.println("z= " + z);

        ComplexNumber inverse = z.inverse();
        System.out.println("1/z=" + inverse);


    }
}
