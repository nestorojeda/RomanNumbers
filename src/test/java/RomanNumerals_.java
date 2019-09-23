import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

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
            assertThat(toRoman(number)).isEqualTo(this.value);
            assertNull(exceptionClass);
        }catch (Exception e){
            assertNotNull(exceptionClass);
        }
    }

    private String toRoman(int number){
        if (number <= 0) throw new IllegalParameterException();
        return number ==1 ? "I" : "II";
    }

    @Parameterized.Parameters
    public static Object[][] cases(){
        return new Object[][]{
                {-1, null, IllegalParameterException.class},
                {0, null, IllegalParameterException.class},
                {1, "I", null},
                {2, "II", null}


        };
    }

    private static class IllegalParameterException extends RuntimeException {
    }
}
