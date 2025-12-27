import java.util.Scanner;

public class lab1task1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Число a");
        double a = sc.nextDouble();

        System.out.println("Число b");
        double b = sc.nextDouble();

        double result;


        if (a * b > 40) {
              result =2 * Math.tan(a);
        }
        else {
            result = b * 4;
        }

        System.out.println("Ответ" + result);

    }


}
