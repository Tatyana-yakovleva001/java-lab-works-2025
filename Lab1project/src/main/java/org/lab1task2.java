package org;

import java.util.Scanner;

public class lab1task2 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи первое число");
        double a = sc.nextDouble();

        System.out.println("Введи второе число");
        double b = sc.nextDouble();

        double max;
        double min;

        if(a > b){
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        double partOne = Math.pow(max, 5) - 3.2 * min;
        double partTwo =  1 + min;
        if(partTwo == 0){
            System.out.println("Делить на 0 нельзя");
        }

        double result = partOne / partTwo;
        System.out.println("d = "  + result);
    }



}
