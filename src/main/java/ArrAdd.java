package src.main.java;

import java.util.Arrays;

public class ArrAdd {


    public static void main(String[] ars) {
        new ArrAdd().add1();
    }

    public void add1() {
        int[][] a1 = {
                {10, 20, 30, 40},
                {11, 22, 33, 44},

                {12, 22, 32, 42}
        };
        long r = 0;
        r = add(a1);
        System.out.println("add " + r);
        r = add2(a1);

        System.out.println(r);

    }

    public long add2(int[][] a1) {
        return Arrays.stream(a1).flatMapToInt(Arrays::stream).sum();
    }

    public long add(int[][] a1) {

        //int ln = a1.length > a1.length ? a1.length : a2.length;
        //int sum[] = new int [a1[0].length];
        long sum = 0;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                sum += a1[i][j];
            }
        }

        return sum;
    }
}
