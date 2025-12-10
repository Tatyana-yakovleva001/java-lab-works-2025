package org.example;

import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String name = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите  пароль:  ");
        int password = sc2.nextInt();


        if(name.equals("Яковлева Татьяна") && password == 912381){
            System.out.println("Вас узнали, добро пожаловать");

        } else {
            System.out.println("Логин и пароль не распознаны. Доступ запрещен");
        }





    }
}