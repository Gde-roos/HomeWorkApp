package Lession_2;

import static Lession_2.L2_E1.L2_E1isSumRange;
import static Lession_2.L2_E2.l2_E2_intCheck;
import static Lession_2.L2_E3.l2_E3_intCheck;
import static Lession_2.L2_E4.l2_E4;
import static Lession_2.L2_E4_extra.isLeap;
import static Lession_2.L2_E5.arrChange;
import static Lession_2.L2_E6.arr100;
import static Lession_2.L2_E7.arrMult;
import static Lession_2.L2_E8.arrDiagonal;
import static Lession_2.L2_E9.arrExtra;


public class L2_E0 {
    public static void main(String[] args) {
        System.out.println("Задание 1 "+ L2_E1isSumRange(100,7));
        l2_E2_intCheck(-9);
        System.out.println("Задание 3 "+ l2_E3_intCheck(-9));
        l2_E4("[Задание 4]", 5);
        System.out.println("задание 4 экстра " + isLeap(-1600));
        arrChange();
        arr100();
        arrMult();
        arrDiagonal(7);
        arrExtra(10,100);
    }
    }

