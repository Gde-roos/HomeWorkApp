package Lession_2;

import java.util.Arrays;

public class L2_E8 {
    public static void arrDiagonal(int n) {

        int[][] arr2d =new int[n][n];
        for (int i=0;i<n-1;i++)
              {
                    arr2d[i][i]=1;

                    arr2d[i][n-i-1]=1;
                }
        System.out.println("Задание 8 ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
