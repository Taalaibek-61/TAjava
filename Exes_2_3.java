package org.example.Seminar1.HomeWork;

public class Exes_2_3 {
    public static void main(String[] args) {
        int[] array = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        System.out.println("summInd(array) = " + summInd(array));
    }

    /**+
     * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     * @param array массив
     * @return массив
     */
    private static int[] summInd(int[] array) {
                 sum = 0;
              result = 0;
      int[] result = int[ array.length];
        for (int i = 0; i < array.length; i++) {
            if(10 =< array[i] && array[i] < 100 || -10 =< array[i] && array[i] > -100) sum+=i;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < 0){
                    array[i] = sum;
                }
              int[] result =  array[i];
                }
        return int[]result;
            }

        }
    }
}
