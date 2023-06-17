package org.example.Seminar1.HomeWork;

import java.util.Scanner;

public class Exes_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел: ");
        int n = scanner.nextInt();
        System.out.println("zadanie_2(n,scanner) = " + zadanie_2(n, scanner));
    }

    /**+
     *  Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     * @param n
     * @param scanner
     * @return
     */

    private static boolean zadanie_2(int n, Scanner scanner) {
        int count = 0;
        int a = 0, b = 0;
        a = scanner.nextInt();
        for (int i = 0; i < n-1 ; i++) {
            b = scanner.nextInt();
            if(a > b) return false;



        }
        return true;
    }
}
