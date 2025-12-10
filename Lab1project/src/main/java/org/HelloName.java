package org;

import  java.util.Scanner;

public class HelloName{
    public static void main(String[] args){
       Scanner one = new Scanner(System.in);
       System.out.println("Введите имя: ");
       String name = one.nextLine();
       Scanner two = new Scanner(System.in);
       System.out.println("Введите время  суток(утро, день, вечер, ночь): ");
       String timeDay = two.nextLine();
       String morning = "утро";
       String day = "день";
       String evening = "вечер";
       String night = "ночь";


       if(timeDay.equals("утро")){
           System.out.println("Доброе утро" + name);
       } else if (timeDay.equals("день")) {
           System.out.println("Добрый день" +  name);
       } else if (timeDay.equals("вечер")) {
           System.out.println("Добрый вечер" + name);
       } else if (timeDay.equals("ночь")) {
           System.out.println("Доброй ночи" + name);

       }
    }


}