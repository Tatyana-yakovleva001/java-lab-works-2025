package org.example;

import java.util.Random;

public class Lab2task3 {
    public static void main(String[] args){
        int[][] matrix = new int[5][6];

        int min = -10;
        int max = 20;

        Random rand = new Random();
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 6; j++){

                matrix[i][j] = rand.nextInt(max - min + 1) + min;

            }
        }

        System.out.println("Матрица");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(matrix[i][j] + "\t");


            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Положительные эл-ты");
        for(int j = 0; j < 6; j++){
            int result = 1;
            boolean flag = false;

            for(int i = 0; i < 5; i ++){
                if(matrix[i][j] > 0){
                    result *= matrix[i][j];
                    flag =true;
                }
            }

            if(flag == true){
                System.out.println((j + 1) + ": " + result);
            }  else {
                System.out.println((j + 1) + "нет положительных эл-ов");
            }
        }


    }
}
