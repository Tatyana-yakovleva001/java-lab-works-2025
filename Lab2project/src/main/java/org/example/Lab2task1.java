package org.example;
import java.util.Arrays;
import java.util.Random;

public class Lab2task1 {
    public static void main(String[] args){

        float[] arr = new float[15];

        Random rand = new Random();

        for(int i = 0; i < 15; i++){
            arr[i] = rand.nextInt(100);

        }

        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(arr));

        float max = arr[0];
        for(int i = 0; i  <15; i++){
            if(arr[i] > max ){
                max = arr[i];

            }
        }

        System.out.println("Макисмальный эл-нт" + max);

        for(int i = 0; i < 15; i ++){
            arr[i] /= max;

        }
        System.out.println("Массив деления каждого эл-нта на максимум" + max);
        System.out.println(Arrays.toString(arr));

    }
}
