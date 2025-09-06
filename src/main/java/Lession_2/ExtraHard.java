package Lession_2;

public class ExtraHard {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i==0||i==5||j==0||j==5)
                {System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                }
                System.out.println();

            }

        }
    }

