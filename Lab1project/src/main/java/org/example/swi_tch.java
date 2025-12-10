package org.example;

import java.util.Arrays;

public  class swi_tch {
    public static void main(String[] args) {

        int[] arr = { 1,1,1,2,2,3};
        if(arr.length == 0) {
            System.out.println(0);
        }

        int write = 1;
        int quantity = 0;

        while(quantity < 2){
            for(int right = 1; right < arr.length; right++){
                if(arr[right] == arr[write - 1]){
                    arr[write] = arr[right];
                    write++;
                    quantity++;
                }
            }
        }

        System.out.println("nums" + Arrays.toString(arr));





 }
}




//
//        int []arr = {1, 4, 2, 10, 2, 3, 1, 0 };
//        System.out.println("arr = " + Arrays.toString(arr));
//        int  k = 3;
//        System.out.println("k = " + k);
//        int windowSum = 0;
//
//        if(arr.length < k){
//            System.out.println("Ошибка");
//        }
//
//        for(int i = 0; i < k; i++){
//            windowSum += arr[i];
//
//
//        }
//        int Maxsum = windowSum;
//
//        for(int i = k; i < arr.length; i++){
//            windowSum = windowSum - arr[i - k] + arr[i];
//            Maxsum = Math.max(Maxsum, windowSum); // сравниваем старую максимальную сумму текущего окна
//            //с windowSum
//        }
//
//        System.out.println("Результат" + Maxsum);







/*

        int[] arr = {1300, 1500, 2100, 900, 300};
        Arrays.sort(arr);

        int difMin = Integer.MAX_VALUE;
        int left = 0;
        int right = arr.length - 1;
        int a = -1;
        int b = -1;

        while(right < arr.length){
            int diff = arr[right] - arr[left];
            if(diff < difMin){
                difMin = diff;
                a = arr[left];
                b = arr[right];

            }
            left++;
            right++;
        }
        System.out.println("Самые близкие события ");
        System.out.println( a + "и" + b);
        System.out.println("Разница" + difMin + "мс");






    }

}
*/



        //Есть ли два числа с разницей k
       /* System.out.println("Введите разницу");
        Scanner sc  = new Scanner(System.in);
        int k = sc.nextInt();

        int[] arr = {23, 45, 12, 54, 20};
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        boolean flag = false;





        while(l < r){
            int diff = arr[r] - arr[l];
            if(diff == k){
                flag = true;
                System.out.println(flag);
                break;


            } else if(diff < k){
                l++;
            } else{
                r--;
            }


        }

        if(!flag){
            System.out.println("Нет такой разницы ");
        }

    }
    }*/
       /* //алгоритм двух указателей
        System.out.println("Введите максимальную сумму");

        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        int[] arr = {23, 45, 12, 54, 20};
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left]);
                System.out.println(arr[right]);
                break;
            } else if (sum < target) {
                left++;


            } else {
                right--;
            }

        }




        //обычный способ
        *//*System.out.println("Введите максимальную сумму");

        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        int[] arr = {23, 45,  12, 54, 20};

        for(int i = 0 ; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);

                }
            }
        }*//*
    }
}
*/
        //Два указателя

 /*       int[] arr = {13, 45, 60, 70, 100, 125};
        int target = 160;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return null;


    }
    public static void main(String[] args){
        int[] result = close();
        if(result != null){
            System.out.println("Пара чисел " + Arrays.toString(result));

    } else {
            System.out.println("Пара с суммой 160 не найдена "  );

        }*/

        //Решение в лоб
 /*       int[] arr = {10, 12, 16, 19, 30, 35, 40};
        int target = 49;
        if(arr == null || arr.length < 2){
            System.out.println("Invalid");

        } for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{arr[i], arr[j]};
                }
            }
        }

        return  null;



        }
    public static void main(String[] args){
        close();
        for( int num : close()){
            System.out.println(num);
        }*/

    /*{
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи строку");
        String input = sc.nextLine();

        input = input.trim();
        System.out.println("После трим" + input);

        if (input.toLowerCase().contains("hello")) {
            System.out.println("Я вижу что вы написали привет");
        } else {
            System.out.println("Здесь нет приветствия");
        }

        if (input.contains("@")) {
            System.out.println("проверка адреса почты");
            boolean startsWithAdmin = input.startsWith("admin");
            boolean endsWithGmail = input.endsWith("@gmail.com");

            System.out.println("Начинается с admin" + startsWithAdmin);
            System.out.println("Заканчивается на gmail" + endsWithGmail);

            if (startsWithAdmin && endsWithGmail) {
                System.out.println("➡ Это администраторский Gmail-аккаунт!");
            } else if (endsWithGmail) {
                System.out.println("➡ Это обычная Gmail-почта.");
            } else {
                System.out.println("➡ Это не Gmail-адрес.");
            }
        }

        int firstA = input.indexOf('a');
        int lastA = input.lastIndexOf('a');
        System.out.println("Поиск букв а");
        if(firstA == -1){
            System.out.println("Буквы а нет в строке");
    }else{
            System.out.println("Первая а на позиции" + firstA);
            System.out.println("Последняя а на позиции" + lastA);
        }

        if(input.contains("_")){
            String replaced = input.replace(("_"), " ");
            System.out.println("После замены" + replaced);

        }

        System.out.println("Разделение на слова");
        String[] words = input.split(" ");
        for(String word : words){
            if(!word.isEmpty()) {
                System.out.println(word);
            }
        }

        if(input.length() >= 3){
            String sub = input.substring(1, 3);
            System.out.println("Подстрока 1, 3" + sub);
         }else{
            System.out.println("Cтрока слишком короткая");
        }

        System.out.println("В нижнем регистре" + input.toLowerCase());
        System.out.println("В верхнем регистре" + input.toUpperCase());






        *//*String coma = sc.nextLine();

        String LowerCase = coma.toLowerCase();
        String UpperCase = coma.toUpperCase();
        System.out.println("В нижнем " + LowerCase);
        System.out.println("В верхнем " + UpperCase);*//*




        *//*String ch = sc.nextLine();
        if(ch.length() < 3){
            System.out.println(ch);
        } else
        {
            char ch1 = ch.charAt(0);
            char ch2 = ch.charAt(1);
            char ch3 = ch.charAt(2);

            System.out.println(ch1);
            System.out.println(ch2);
            System.out.println(ch3);

        }*//*








    }*/


/*
public class swi_tch {
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left  < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    public static void main(String[] args){
        int[]arr = {1, 2, 3, 4, 5};
        reverse(arr);
        for(int x : arr){
            System.out.println(x + " ");
        }
    }*/

       /* if(arr.length  == 0 || arr == null)        {
            throw new IllegalArgumentException("Массив пустой");
        }

        int sum = 0;
        int average = 0;

        for(int i = 1; i < arr.length; i++){
            sum += arr[i];


        }
        average = sum / arr.length;
        return average;

    }
    public static void main(String[] args)
    {
        int[] arr = {13, 23, 90, 45, 20};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        System.out.println("Average" + averageArr(arr));

    }*/
