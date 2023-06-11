package org.example.Seminar1.HomeWork;

import java.util.Scanner;

public class Exes1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String[] str = new String[10000];
            System.out.println("Введите строку: ");
            str = scanner.nextLine().split(" ");
            System.out.println("dzadanie1(str) = " + dzadanie1(str));
            scanner.close();
        }
    }

    /**+
     * Учитывая входную строку s, измените порядок слов на противоположный .
     * @param s строка
     * @return результат
     */
    private static String dzadanie1(String[] s) {
        //String[]array = str. trim();//.split(" ");
        //String [] words = array.split(" ");
        //String[] charArray = words;
        String resultString = " ";
        for (int i = s.length; i > 0 ; i--) {
            resultString += s[i-1] + " ";

        }
        return resultString;

    }
}
