package Lession_2;

import java.util.Arrays;

public class L2_E5 {

    public static void arrChange(){
        int[] arr = {1,0,1,0,0,1,1,0,1,0,1,1,0,0};
        //System.out.println(Arrays.toString(arr));
        int a = arr.length-1;
        for (int i=0; i<=a;i++){
            if (arr[i]==1){arr[i]=0;}
            else {arr[i]=1;}
    }
        System.out.println("Задание 5 "+Arrays.toString(arr));
}}
