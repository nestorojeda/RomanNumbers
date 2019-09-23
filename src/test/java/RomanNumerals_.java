import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.not;
import static org.junit.Assert.*;

@RunWith(org.junit.runners.Parameterized.class)
public class RomanNumerals_ {


    public static final String[] TENTHS = {"X", "XX", "XXX"};
    private final int number;
    private final String value;
    private final Class exceptionClass;

    public RomanNumerals_(int number, String value, Class exceptionClass) {
        this.number = number;
        this.value = value;
        this.exceptionClass = exceptionClass;
    }

    @Test
    public void execute(){
        try {
            assertThat(toRoman(number)).isEqualTo(this.value);
            assertNull(exceptionClass);
        }catch (Exception e){
            assertNotNull(exceptionClass);
        }
    }

    public static final int MIN = 0;
    public static final int MAX = 4000;
    public static final String[] ONES = {"I", "II", "III"};


    private String toRoman(int number){
        if (number <= MIN || number >= MAX) throw new IllegalParameterException();
        if(number == 100) return "C";
        if(number == 200) return "CC";
        if(number >= 10) return TENTHS[(number /10)-1] ;





        return ONES[number-1];
    }

    @Parameterized.Parameters
    public static Object[][] cases(){
        return new Object[][]{
                {-1, null, IllegalParameterException.class},
                {0, null, IllegalParameterException.class},

                {1, "I", null},
                {2, "II", null},
                {3, "III", null},

                {10, "X", null},
                {20, "XX", null},
                {30, "XXX", null},
                {100, "C", null},
                {200, "CC", null},
                //{300, "CCC", null},
                //{1000, "M", null},
                //{2000, "MM", null},
                //{3000, "MMM", null},

                {4000, null, IllegalParameterException.class},
                {5000, null, IllegalParameterException.class}




        };
    }

    private static class IllegalParameterException extends RuntimeException {
    }
}
