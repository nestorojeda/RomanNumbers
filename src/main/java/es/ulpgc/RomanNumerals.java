package es.ulpgc;

public class RomanNumerals {

    private static final int MIN = 0;
    private static final int MAX = 4000;
    private static final String[] ONES = {"I", "II", "III"};
    private static final String[] TENS = {"X", "XX", "XXX"};
    private static final String[] HUNDREDS = {"C", "CC", "CCC"};
    private static final String[] THOUSANDS = {"M", "MM", "MMM"};


    private static String times (int offset, String[] constants) {
        if(offset == 0) return "";
        return constants[offset-1];
    }

    public static String toRoman(int number){
        if (number <= MIN || number >= MAX) throw new IllegalParameterException();
        if(number >= 1000) return times(thousands(number), THOUSANDS);
        return  times(hundreds(number), HUNDREDS) + times(tens(number), TENS) + times(ones(number), ONES);
    }

    private static int ones(int number){
        return number % 10;
    }
    private static int tens(int number) {
        return (number % 100) / 10;
    }
    private static int hundreds(int number) {
        return (number % 1000) / 100;
    }
    private static int thousands(int number) { return number/1000; }

    public static class IllegalParameterException extends RuntimeException {
    }


}

