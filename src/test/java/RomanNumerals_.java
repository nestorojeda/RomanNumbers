import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.omg.PortableInterceptor.ServerRequestInfo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(org.junit.runners.Parameterized.class)
public class RomanNumerals_ {

    private final int number;
    private final String value;
    private final boolean exceptionExpected;

    public RomanNumerals_(int numbere, String value, boolean exceptionExpected) {
        this.number = numbere;
        this.value = value;
        this.exceptionExpected = exceptionExpected;
    }

    @Test
    public void execute(){
        try {
            assertThat(toRoman(number)).isEqualTo(this.value);
            assertFalse(exceptionExpected);
        }catch (Exception e){
            assertTrue(exceptionExpected);
        }
    }

    private String toRoman(int number){
        throw new IllegalParameterException();
    }

    @Parameterized.Parameters
    public static Object[][] cases(){
        return new Object[][]{
                {0, null, true}


        };
    }

    private static class IllegalParameterException extends RuntimeException {
    }
}
