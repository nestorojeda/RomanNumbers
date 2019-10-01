package es.ulpgc;

import java.util.ArrayList;

import java.util.Collections;

public class NumberBreakdown {


    public int[][] decompose(int number){
        if(number == 0) return new int[][]{};
        int length = (int) (Math.log10(number) + 1);

        ArrayList<int[]> list = new ArrayList<int[]>();

        for (int i = 0; i < length; i++) {
            if(number % 10 != 0) list.add(new int[]{number%10, i});
            number = number /10;
        }

        Collections.reverse(list);

        int [][] res = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;

    }


}
