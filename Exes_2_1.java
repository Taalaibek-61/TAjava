package org.example.Seminar1.HomeWork;

import java.util.Scanner;

public class Exes_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество положительных чисел: ");
        int n = scanner.nextInt();
        System.out.println("zadanie_1(n, scanner) = " + zadanie_1(n, scanner));
    }

    /**
     * +
     * Дана последовательность N целых чисел. Найти сумму простых чисел.
     *
     * @param n       последовательность целых чисел
     * @param scanner сканнер
     * @return сумма простых чисел
     */

    private static int zadanie_1(int n, Scanner scanner) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int t = 0;
            int a = scanner.nextInt();
            for (int j = 2; j < a - 1; j++) {
                if (a % j == 0) {
                    t++;
                }
            }
            if (t == 0) {
                sum += a;
            }
        }
        scanner.close();
        return sum;
    }
}
