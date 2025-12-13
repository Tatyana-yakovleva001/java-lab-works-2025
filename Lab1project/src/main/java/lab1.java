import java.util.Scanner;

public class lab1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый аргумент");
        int n1 = sc.nextInt();
        System.out.println("Введите второй аргумент");
        int n2 = sc.nextInt();

        double result;


        if(n1 * n2 > 40){
            result = Math.tan(Math.toRadians(2 * n1));
            System.out.println("Произведение больше 40, поэтому вот двойной тангенс первого числа: " + result);

        } else {
            result = n2 * 4;
            System.out.println("Произведение меньше 40, вот второче число умноженное на 4: " + result);
        }
    }
}
