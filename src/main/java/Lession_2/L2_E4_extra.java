package Lession_2;

public class L2_E4_extra {
    public static boolean isLeap(int a){
        boolean isLeap = false;
        int b = a%4;
        int c = a%100;
        int d = a%400;
        if (d==0){isLeap = true;}
        else if (b==0) {
            if (c!=0){isLeap =true;}
            else isLeap = false;

        }
        else isLeap=false;

        return isLeap;
    }
}
