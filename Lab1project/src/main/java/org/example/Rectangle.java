package org.example;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        System.out.println("Выберите операцию:" +
                "1 - Проверить баланс " +
                " 2 - Пополнить счет" +
                " 3 - Снять деньги " +
                " 4 - Выход"
                );

        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Ваш баланс:" + balance);
                break;
            case 2:
                System.out.println("На какой счет хотите пополнить баланс?");
                int replen = sc.nextInt();
                int repbalance = balance +  replen;
                System.out.println("Ваш текущий баланс " + repbalance);
                break;
            case 3:
                System.out.println("Какую сумму вы хотите снять? ");
                int remove = sc.nextInt();
                if(remove <= balance){
                    int rembalance = remove  - balance;
                    System.out.println("Ваша текущая сумма " + rembalance);

                } else{
                    System.out.println("Недостаточно средств для снятия.");
                }
                break;
            case 4:
                System.out.println("Спасибо за использование, До Завтра!");
                break;

            default:
                System.out.println("Вы ввели некорректный номер опции");
                break;




        }
    }
}

