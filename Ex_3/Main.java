package org.example.Seminar1.HomeWork.Ex_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Плаха", "Ч Айтматов", 1_000, 2010, 195);
        Book book2 = new Book("Анна Каренина", "Л Толстой", 3_000, 2008, 1395);
        Book book3 = new Book("Капитанская дочка", "А Пушкин", 900, 2011, 105);
        Book book4 = new Book("Тихий Дон", "М Шолохов", 2_000, 2006, 675);
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        System.out.println("sourchBook(bookList) = " + sourchBook(bookList));
    }
    /**
     * +
     * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
     * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год
     * издания после 2010 г, включительно.
     *
     * @param bookList данные по книгам
     * @return результат
     */
    private static ArrayList<String> sourchBook(ArrayList<Book> bookList) {
        ArrayList<String> result = new ArrayList<>();
        for (Book book : bookList) {
            if (chekNum(book.getCount()) && book.getSurname().toLowerCase().contains("а") && book.getYear() >= 2010) {
                result.add(book.getName());
            }
        }
        return result;
    }
    private static boolean chekNum(int num) {
        if (num < 2) return true;
        for (int i = 0; i < num; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
