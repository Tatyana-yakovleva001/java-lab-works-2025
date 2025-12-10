import java.util.concurrent.Callable;

public  class Collections {
    private String name;
    private int age;
    private String email;

    // Конструктор
    public Collections(String name, int age, String email) {
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
    }

    // Геттер и сеттер для name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Геттер и сеттер для age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Геттер и сеттер для email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            this.email = "unknown@email.com";
        } else {
            this.email = email;
        }
    }

    // Метод toString
    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    // Метод main для теста
    public static void main(String[] args) {
        Collections p1 = new Collections("Андрей", 25, "andrey@mail.com");
        Collections p2 = new Collections("Мария", -5, "mariaexample.com");
        Collections p3 = new Collections("Иван", 130, "ivan@site.ru");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}






















//package org.example;
//
//class Dog{
//    private String name;
//    private int age;
//    private String owner;
//
//    public Dog(String name, int age, String owner) {
//        if(age < 0 ){
//            this.age = 1;
//        } else{
//            this.age = age;
//        }
//        this.name = name;
//        this.owner = owner;
//    }
//    public void setAge(int newAge){
//        if(newAge < 0 ){
//        this.age = 1;
//    } else{
//        this.age = age;
//    }
//
//    }
//
//    public String getOwner(){
//        return "Mr. " + owner;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", owner='" + owner + '\'' +
//                '}';
//    }
//}
//
//
//public class Collections {
//    public static void main(String[] args){
//        Dog dog = new Dog("Muhtar", -10, "Петр");
//        System.out.println(dog);
//        dog.setAge(-1);
//        System.out.println(dog);
//        System.out.println(dog.getOwner());
//
//
//
//    }
//}
//https://chatgpt.com/?utm_source=google&utm_medium=paidsearch_brand&utm_campaign=GOOG_C_SEM_GBR_Core_CHT_BAU_ACQ_PER_MIX_ALL_EMEA_UA_EN_042225&utm_term=chat%20gpt&utm_content=175689713502&utm_ad=747938588585&utm_match=e&gad_source=1&gad_campaignid=22472177954&gbraid=0AAAAA-IW-UWqesAOkjjC9Ua8-GVtZUm83&gclid=CjwKCAjw6vHHBhBwEiwAq4zvA8guALcBJz_i7ZaXheaNeZ9JnYL2IBRe0ls0hq1kQRCloQhP1n0CBRoCT9QQAvD_BwE



       /* LinkedList<String> name = new LinkedList<>();
        name.add("Вася");
        name.add("Петя");
        name.add("Гена");
        name.add("Оля");

        for (String user : name){
            System.out.println(user);
        }

        String firstName = name.removeFirst();
        System.out.println("\nИзвлекшееся имя " + firstName) ;

        name.addLast("Вика");

        for (String task : name){
            System.out.println("\nИзмененный список: " + task);
        }
*/



        /* Random random = new Random();
        ArrayList<Integer> number = new ArrayList<>();

        for(int i = 0; i < 8; i++){
            number.add(random.nextInt(20) );


        }

        System.out.println("Сгенерированный список " + number);
        int max = Integer.MIN_VALUE;
        for (Integer num : number){
            if(num > max){
                max = num;
            }
        }

        System.out.println("Самое большое число" + max);

*/

/*
        Random random = new Random();
        ArrayList<Integer>  numbers = new ArrayList<>();

        for(int i  = 0; i < 6; i++){
            numbers.add(random.nextInt(10) + 1);
        }

        System.out.println("Сгенерированный список " + numbers);

        int count = 0;
        for(int number : numbers){
            if(number == 7){
                count++;
            }
        }*/

    /*    System.out.println("Число 7 встречается" + count + "раз");*/
       /* LinkedList<String> name = new LinkedList<>();
        name.addLast("Аня");
        name.addLast("Коля");
        name.addLast("Вика");
        name.addFirst("Максим");

        for(String names : name){
            System.out.println(names);
        }*/
   /*     ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Груша");
        fruits.add("Банан");
        fruits.add("Апельсин");

        for (String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println("--------------------------");

        fruits.set(3, "Арбуз");

        for (String fruit : fruits){
            System.out.println(fruit);
        }

*/


       /* ArrayList<Integer> num = new ArrayList<>();
        num.add(34);
        num.add(5);
        num.add(13);
        num.add(23);

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if(num.contains(number)){
            System.out.println("Мы нашли похоже число" + number);
        } else{
            System.out.println("Похожих чисел нет");
        }
*/









/*

/* ArrayList<String> students = new ArrayList<>();
        students.add("Вика");
        students.add("Даня");
        students.add("Саня");
        students.add("Ваня");

        for (String student : students){
            System.out.println(student);
        }

        students.remove(2);

        System.out.println("---------------------------");


        for (String student : students){

            System.out.println(student);
        }


*/

/*  LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.6f);
        numbers.add(15.26f);

        for(Float el : numbers){
            System.out.println(el);
        }
*/

      /*  ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(50);
        numbers.add(0, 30);
*/

/*  System.out.println(numbers.size());*//*

        System.out.println(numbers.get(1) ); // получить определенное число
        numbers.remove(1); // удалить определенное число
        numbers.clear(); // полностью очистить список


        for(Integer element : numbers){
            System.out.println(element);
        }

*/

/*
        List<String> fruits = new ArrayList<>();
        fruits.add("яблоко");
        fruits.add("вишня");
        fruits.add("арбуз");
        fruits.add("яблоко");
        System.out.println(fruits);
*/




