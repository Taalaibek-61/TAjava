package org.example.Seminar1.HomeWork;

import java.net.SocketOption;
import java.util.Scanner;

public class Exes2 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("dzadanie2(n,scanner) = " + dzadanie2(n,scanner));



    }

    /**+
     * Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
     * после которых следует отрицательное число.
     * @param n Заданные числа
     * @return результат
     */
    private static int dzadanie2(int n, Scanner scanner) {
        int sum = 0;
        int a = 0, b = 0;
        a = scanner.nextInt();
            for (int i = 0; i < n-1 ; i++) {
                 b = scanner.nextInt();
                 if (a != 0 && b != 0)
                    if(a > 0 && b < 0  ) sum += a;
                a = b;





            }

        scanner.close();
        return sum;
    }
}
