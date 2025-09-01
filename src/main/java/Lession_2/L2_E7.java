package Lession_2;

import java.util.Arrays;

public class L2_E7 {
    public static void arrMult() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        int a = arr.length-1;
        for (int i =0;i<=a;i++){
            if (arr[i]<6){
                arr[i]=arr[i]*2;
            }
        }
        System.out.println("Задание 7 "+ Arrays.toString(arr));

    }
}
