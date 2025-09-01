package Lession_2;

import java.util.Arrays;

public class L2_E6 {
    public static void arr100(){
        int[] arr= new int[100];
        int a = arr.length-1;
        for (int i=0;i<=a;i++){
            arr[i]=i+1;
        }
        System.out.println("Задание 6 " + Arrays.toString(arr));
    }
}
