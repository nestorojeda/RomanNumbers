package es.ulpgc;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TuppleMapper {

    /*
        0       1       2       3
    1   I       X       C       M
    2   II      XX      CC      MM
    3   III     XXX     CCC     MMM
    4   IV      XL      CD
    5   V       L       D
    6   VI      LX      DC
    7   VII     LXX     DCC
    8   VIII    lXXX    DCCC
    9   IX      IC      CM
     */

    private static final String[][] ROMAN_MATRIX = {
            {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"C", "CC", "CCC", "CD", "D","DC","DCC","DCCC","CM"},
            {"M" ,"MM" ,"MMM"}
    };



    public static String tuppleMapper(int[][] brokeNumbers){
        return Arrays.stream(brokeNumbers).map(tuple -> ROMAN_MATRIX[tuple[1]][tuple[0] - 1]).collect(Collectors.joining());
    }

}
