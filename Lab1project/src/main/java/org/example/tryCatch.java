package org.example;
import java.util.Scanner;
import javax.swing.plaf.IconUIResource;
import java.util.Arrays;



/*
Просит пользователя ввести любое количество чисел (целых или дробных) через пробел.
Разделяет строку и преобразует все значения в double.
Игнорирует отрицательные числа.
Считает сумму только положительных чисел.
Если пользователь ввёл не числа — сообщает об ошибке.
Если нет ни одного положительного числа — пишет:
*/

/*  Scanner sc = new Scanner(System.in);
  System.out.println("Введи числа");
  String input = sc.nextLine();
  String parts[] = input.trim().split("\\s+");

  if (parts.length == 0 || parts[0].isEmpty()) {
      System.out.println("Вы ничего не ввели");
  }

  double sum = 0;
  int PositiveCounter = 0;

  try{
      for(String part : parts){
          Double num = Double.parseDouble(part);
          if(num > 0){
              sum += num;
              PositiveCounter++;

          }
      }

      if(PositiveCounter <= 0){
          System.out.println("Нет положительных чисел для подсчёта");
      } else {
          System.out.printf("Сумма положительных чисел: %.2f%n", sum);
      }

  }catch(NumberFormatException e){
      System.out.println("Все параметры должны быть числами");

  }*/
/*

Условие:
Реализовать программу на Java, которая:
Считывает с клавиатуры несколько чисел, введённых через пробел.
Находит среднее значение всех отрицательных чисел.
Если отрицательных чисел нет — выводит сообщение "Нет отрицательных чисел для вычисления среднего".
Если ввод содержит нечисловые значения — вывести "Все параметры должны быть числами".

*/

/*
public class tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите несколько чисел: ");
        String input = sc.nextLine();
        String parts[] = input.trim().split("\\s+");

        if(parts.length == 0 ||(parts.length == 1 && parts[0].isEmpty()) ){
            System.out.println("Вы ничего не ввели");
            return;
        }

        double sumNegativeN = 0;
        double negativeN = 0;

         try{
             for(String part : parts){
                 double num = Double.parseDouble(part);
                 if(num < 0){
                     sumNegativeN += num;
                     negativeN++;

                 }

             }

             if(negativeN > 0){
                 Double average = sumNegativeN / negativeN;
                 System.out.println("Результат = " + average);
             } else {
                 System.out.println("Здесь нет отрицательных чисел");
             }

         }catch(NumberFormatException e){
             System.out.println("Все параметры должны быть числами");

         }


    }}
*/



/*
Условие:
Пользователь вводит температуры за несколько дней через пробел.
Программа выводит:

Среднюю температуру,

Максимальную,

Минимальную.
Если данные некорректные — вывести "Все параметры должны быть числами".*/

/*
public class tryCatch{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру за несколько дней: ");
        String input = sc.nextLine();
        String[] temps = input.trim().split("\\s+");

        if(temps.length == 0 || (temps.length == 1 && temps[0].isEmpty())){
            System.out.println("Вы ничего не ввели");
        }

        double maxt = Double.MIN_VALUE;
        double mint = Double.MAX_VALUE;
        double sum = 0.0;
        int count = 0;


        try{
            for( String temp : temps){
                double numt = Double.parseDouble(temp);
                if(numt > maxt){
                    maxt = numt;

                }
                if(numt < maxt){
                    mint = numt;
                }
                sum+=numt;
                count++;

            }

            double average = (count > 0 ) ? sum / count : 0;

            System.out.println("Минимальная температура " + mint);
            System.out.println("Максимальная температура " + maxt);
            System.out.println("Средняя температура " + average);
        }catch(NumberFormatException e){
            System.out.println("Все параметры должны быть числами");
        }

    }

}
*/

/*
Ввести в качестве параметров имя пользователя и пароль.
Проверить в методе main() соответствие введенных значений заранее
определенным значениям. В случае полного соответствия вывести
сообщение “Вас узнали. Добро пожаловать”, в противном случае вывести
        сообщение “Логин и пароль не распознаны. Доступ запрещен”.
*/

public class tryCatch{
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