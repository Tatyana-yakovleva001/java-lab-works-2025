package org.example;


import java.util.Arrays;

public class Lab2task2 {
    public static void main(String[] args){
        int[] oneArr = {21, 0, 13, 10, 14, -6, 32, 56, 4};

        int count = 0;

        for(int i = 0; i < oneArr.length; i++){
            if(oneArr[i] != 0){
                count++;
            }
        }


        int[] twoArr = new int[count];


        int mark = 0;
        for( int i = 0; i < oneArr.length; i++){
            if( oneArr[i] != 0 ){
                twoArr[mark] = oneArr[i] / 5;
                mark++;
            };
        }

        for(int i = 0 ; i < twoArr.length; i++) {
            int minM = i;
            for (int j = i + 1; j < twoArr.length; j++) {
                if (twoArr[j] < twoArr[minM]) {
                    minM = j;
                }
            }

            int X = twoArr[i];
            twoArr[i] = twoArr[minM];
            twoArr[minM] = X;

        }

        System.out.println("Первый массив ");
        System.out.println(Arrays.toString(oneArr));

        System.out.println("Второй массив ");
        System.out.println(Arrays.toString(twoArr));
    }


}
