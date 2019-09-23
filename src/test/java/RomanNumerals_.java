import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(org.junit.runners.Parameterized.class)
public class RomanNumerals_ {

    private final int numbere;
    private final String value;
    private final boolean exceptionExpected;

    public RomanNumerals_(int numbere, String value, boolean exceptionExpected) {
        this.numbere = numbere;
        this.value = value;
        this.exceptionExpected = exceptionExpected;
    }

    @Test
    public void execute(){
        
    }

    @Parameterized.Parameters
    public static Object[][] cases(){
        return new Object[][]{
                {0, null, true}

        };
    }
}
