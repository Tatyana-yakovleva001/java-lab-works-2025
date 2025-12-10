package org.example;


import java.util.ArrayList;
import java.util.Scanner;

class Book{
    String title;
    int year;
    int price;

    Book(String title, int year, int price){
        this.title = title;
        this.year =year;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Книга{название='" + title + "', год=" + year + ", цена=" + price + "}";
    }
}
public class Sorts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("Введиите данные о книгах, для завершения вводаведите 'end'. ");

        while(true){
            try {
                System.out.println("Введите название книги или 'end' для завершения ");
                String titleInput = sc.nextLine().trim();
                if(titleInput.equalsIgnoreCase("end")){
                    break;
                }
                if (titleInput.isEmpty()){
                    System.out.println("Вы ничего не ввели");
                    System.out.println("Ошибка: название книги не может быть пустым");
                    continue;
                }
                System.out.println("Введите год издания книги(целое число): ");
                String yearInput = sc.nextLine().trim();
                int year = Integer.parseInt(yearInput);

                if(year < 1450 || year > 2025){
                    System.out.println("Ошибка: год издания должен быть в диапазоне 1450-2025. Попробуйте снова. ");
                    continue;
                }

                System.out.println("Введите цену книги (целое число):");
                String priceInput = sc.nextLine().trim();
                int price = Integer.parseInt(priceInput);

                if(price <= 0){
                    System.out.println("Ошибка: цена должна быть положительной. Попробуйте снова.");
                    continue;
                }

                books.add(new Book(titleInput, year, price));


            } catch (NumberFormatException e){
                System.out.println("Ошибка: нужно вводить целые числа для года и цены. Попробуйте снова.");
            }
        }

        //Пузырьковать сортировка
        for(int i = 0; i < books.size() - 1; i++){
            for(int j = 0; j < books.size() - 1 - i; j++){
                if(books.get(j).price < books.get(j + 1).price){
                    Book temp = books.get(j);
                    books.set(j,books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        System.out.println("Отсортированный список книг по убыванию цены");
        for(Book book : books){
            System.out.println(book);
        }

    }
}