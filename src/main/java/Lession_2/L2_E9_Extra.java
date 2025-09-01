package Lession_2;

import java.util.Arrays;

public class L2_E9_Extra {
    public static void main(String[] args) {

        {
            int n = 3;
            int[] arr = {0,1, 2, 3, 4, 5, 6, 7, 8, 9};
            int len = arr.length;

            if (len == 0) return;

            n = n % len;          // нормализация
            if (n < 0) n = len + n; // переводим отрицательный сдвиг в эквивалентный вправо

            for (int step = 0; step < n; step++) {
                // сохраняем последний элемент
                int last = arr[len - 1];
                // сдвигаем всё вправо на 1
                for (int i = len - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                // ставим сохранённый элемент в начало
                arr[0] = last;
            }


            System.out.println(Arrays.toString(arr));
        }

    }
}


