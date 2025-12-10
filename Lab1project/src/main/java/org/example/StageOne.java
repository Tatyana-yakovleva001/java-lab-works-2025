package org.example;
import java.util.Scanner;


public class StageOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean success = false;

        for(int i = 0; i < 4;i++){
            System.out.println("Введите ваше имя ");
            String name = sc.nextLine().trim();

            System.out.println("Введите ваш пароль");
            try{
                int password = sc.nextInt();
                sc.nextLine();

                if(name.equals("Яковлева Татьяна") && password == 20061606){
                    System.out.println("Добро пожаловать");
                    success = true;
                    break;
                } else{
                    System.out.println("Ваш логин или пароль неверны , попробуйте еще раз");
                }




            }catch(Exception e){
                System.out.println("Пароль должен быть числом");
                sc.nextLine();

            }
        }

        if(!success){
            System.out.println("Попытки исчерпаны. Доступ запрещен ");
        }

    }

}
