package es.ulpgc;

public class NumberBreakdown {
    public int[][] decompose(int number){
        if(number == 0) return new int[][]{};
        int length = (int) (Math.log10(number) + 1);
        if(number % 1000 == 0) return new int[][]{{number/1000, 3 }};
        if(length == 3) return (number % 100 == 0) ? new int[][]{hundreds(number)} : new int[][]{hundreds(number), tens(number)};
        if(length == 2)  return (number % 10 == 0) ? new int[][]{tens(number)} : new int[][] {tens(number), ones(number)};
        return new int[][] {ones(number)};

    }

    private int[] hundreds(int number){
        return new int[]{(number % 1000) / 100, 2};
    }

    private int[] tens (int number){
        return new int[]{(number % 100) / 10, 1};
    }

    private int[] ones(int number){
        return new int[]{number%10,0};
    }

}
