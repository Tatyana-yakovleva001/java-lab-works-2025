package org.example;

import java.util.Scanner;

public class Lab2task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Размер матрицы");

        int size = sc.nextInt();

        int[][] Arr = new int[size][size];

        System.out.println("Введи эл-ты матрицы");
        for (int i = 0; i <size; i++){
            for(int j = 0; j < size; j++ ){
                Arr[i][j] = sc.nextInt();
            }
        }

        Integer  MaxMinus = null;
        for(int i = 0; i < size; i++ ){
            for(int j = 0; j  <size; j++){

                if(i + j <size - 1){
                    if(Arr[i][j] < 0){
                        if (MaxMinus== null ||  Arr[i][j] > MaxMinus) {
                            MaxMinus  = Arr[i][j];
                        }
                    }
                }
            }
        }

        if(MaxMinus !=null){
            System.out.println("Макс отрицательный над поюочной диаганалью:" + MaxMinus);
        } else{
            System.out.println("Отрицательных эл-ов нет ");
        }

    }
}
