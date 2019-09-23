import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.not;
import static org.junit.Assert.*;

import es.ulpgc.RomanNumerals;

@RunWith(org.junit.runners.Parameterized.class)
public class RomanNumerals_ {


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
            assertThat(RomanNumerals.toRoman(number)).isEqualTo(this.value);
            assertNull(exceptionClass);
        }catch (Exception e){
            assertNotNull(exceptionClass);
        }
    }

    @Parameterized.Parameters
    public static Object[][] cases(){
        return new Object[][]{
                {-1, null, RomanNumerals.IllegalParameterException.class},
                {0, null, RomanNumerals.IllegalParameterException.class},

                {1, "I", null},
                {2, "II", null},
                {3, "III", null},

                {10, "X", null},
                {11, "XI", null},
                {20, "XX", null},
                {30, "XXX", null},
                {100, "C", null},
                {110, "CX", null},

                {200, "CC", null},
                {300, "CCC", null},

                {1000, "M", null},

                {2000, "MM", null},
                {3000, "MMM", null},

                {4000, null, RomanNumerals.IllegalParameterException.class},
                {5000, null, RomanNumerals.IllegalParameterException.class}




        };
    }

}
